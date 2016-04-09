package br.com.soapboxrace.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "LOBBYENTRANT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LobbyEntrantInfoType", propOrder = { "gridIndex", "heat", "level", "personaId", "state" })
public class LobbyEntrantEntity {

	@XmlTransient
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Transient
	@XmlElement(name = "GridIndex")
	protected int gridIndex = 0;

	@Transient
	@XmlElement(name = "Heat")
	protected int heat = 1;

	@Transient
	@XmlElement(name = "Level")
	protected int level = 1;

	@Transient
	@XmlElement(name = "PersonaId")
	protected int personaId;

	@ManyToOne
	@JoinColumn(name = "PERSONAID", referencedColumnName = "ID")
	private PersonaEntity persona;

	@ManyToOne
	@JoinColumn(name = "LOBBYID", referencedColumnName = "ID")
	private LobbyEntity lobby;

	@Transient
	@XmlElement(name = "State", required = true)
	protected String state = "InLobby";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getGridIndex() {
		return gridIndex;
	}

	public void setGridIndex(int gridIndex) {
		this.gridIndex = gridIndex;
	}

	public int getHeat() {
		return heat;
	}

	public void setHeat(int heat) {
		this.heat = heat;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPersonaId() {
		return personaId;
	}

	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}

	public PersonaEntity getPersona() {
		return persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public LobbyEntity getLobby() {
		return lobby;
	}

	public void setLobby(LobbyEntity lobby) {
		this.lobby = lobby;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
