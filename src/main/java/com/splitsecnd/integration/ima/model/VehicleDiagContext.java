//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 01:34:13 PM CST 
//


package com.splitsecnd.integration.ima.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Diagnostic context, usually used with bcall.
 *       
 * 
 * <p>Java class for VehicleDiagContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleDiagContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://not.ima.tm.fr/telematic}ContextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="watertemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oiltemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oillevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fuellevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fueleconomy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fuelrange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lpglevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lpgrange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kilometers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="servicerange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="servicedays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="waterTempAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oilTempAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="waterLevelAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oilLevelAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oilPressureAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gearOilTempAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fluidPressureAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="brakeLevelAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="suspensionMajorAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="brakePadAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gearboxAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eobdAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="antiTheftAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tirePressureAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="absAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="espAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fpsFluidLevelAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fpsFullAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="suspensionSpeedAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="suspension2Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="steeringAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="parkBrakeAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="waterInFuelAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="engineAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="suspension3Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="steering2Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="brakeAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="airbagAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fpsFluid2Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="batteryAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tireFLAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tireFRAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tireRRAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tireRLAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDiagContext", propOrder = {
    "watertemp",
    "oiltemp",
    "oillevel",
    "fuellevel",
    "fueleconomy",
    "fuelrange",
    "lpglevel",
    "lpgrange",
    "kilometers",
    "servicerange",
    "servicedays",
    "waterTempAlarm",
    "oilTempAlarm",
    "waterLevelAlarm",
    "oilLevelAlarm",
    "oilPressureAlarm",
    "gearOilTempAlarm",
    "fluidPressureAlarm",
    "brakeLevelAlarm",
    "suspensionMajorAlarm",
    "brakePadAlarm",
    "gearboxAlarm",
    "eobdAlarm",
    "antiTheftAlarm",
    "tirePressureAlarm",
    "absAlarm",
    "espAlarm",
    "fpsFluidLevelAlarm",
    "fpsFullAlarm",
    "suspensionSpeedAlarm",
    "suspension2Alarm",
    "steeringAlarm",
    "parkBrakeAlarm",
    "waterInFuelAlarm",
    "engineAlarm",
    "suspension3Alarm",
    "steering2Alarm",
    "brakeAlarm",
    "airbagAlarm",
    "fpsFluid2Alarm",
    "batteryAlarm",
    "tireFLAlarm",
    "tireFRAlarm",
    "tireRRAlarm",
    "tireRLAlarm"
})
public class VehicleDiagContext
    extends ContextObject
{

    protected Integer watertemp;
    protected Integer oiltemp;
    protected Integer oillevel;
    protected Integer fuellevel;
    protected Integer fueleconomy;
    protected Integer fuelrange;
    protected Integer lpglevel;
    protected Integer lpgrange;
    protected Integer kilometers;
    protected Integer servicerange;
    protected Integer servicedays;
    protected Boolean waterTempAlarm;
    protected Boolean oilTempAlarm;
    protected Boolean waterLevelAlarm;
    protected Boolean oilLevelAlarm;
    protected Boolean oilPressureAlarm;
    protected Boolean gearOilTempAlarm;
    protected Boolean fluidPressureAlarm;
    protected Boolean brakeLevelAlarm;
    protected Boolean suspensionMajorAlarm;
    protected Boolean brakePadAlarm;
    protected Boolean gearboxAlarm;
    protected Boolean eobdAlarm;
    protected Boolean antiTheftAlarm;
    protected Boolean tirePressureAlarm;
    protected Boolean absAlarm;
    protected Boolean espAlarm;
    protected Boolean fpsFluidLevelAlarm;
    protected Boolean fpsFullAlarm;
    protected Boolean suspensionSpeedAlarm;
    protected Boolean suspension2Alarm;
    protected Boolean steeringAlarm;
    protected Boolean parkBrakeAlarm;
    protected Boolean waterInFuelAlarm;
    protected Boolean engineAlarm;
    protected Boolean suspension3Alarm;
    protected Boolean steering2Alarm;
    protected Boolean brakeAlarm;
    protected Boolean airbagAlarm;
    protected Boolean fpsFluid2Alarm;
    protected Boolean batteryAlarm;
    protected Boolean tireFLAlarm;
    protected Boolean tireFRAlarm;
    protected Boolean tireRRAlarm;
    protected Boolean tireRLAlarm;

    /**
     * Gets the value of the watertemp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatertemp() {
        return watertemp;
    }

    /**
     * Sets the value of the watertemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatertemp(Integer value) {
        this.watertemp = value;
    }

    /**
     * Gets the value of the oiltemp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOiltemp() {
        return oiltemp;
    }

    /**
     * Sets the value of the oiltemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOiltemp(Integer value) {
        this.oiltemp = value;
    }

    /**
     * Gets the value of the oillevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOillevel() {
        return oillevel;
    }

    /**
     * Sets the value of the oillevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOillevel(Integer value) {
        this.oillevel = value;
    }

    /**
     * Gets the value of the fuellevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuellevel() {
        return fuellevel;
    }

    /**
     * Sets the value of the fuellevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuellevel(Integer value) {
        this.fuellevel = value;
    }

    /**
     * Gets the value of the fueleconomy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFueleconomy() {
        return fueleconomy;
    }

    /**
     * Sets the value of the fueleconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFueleconomy(Integer value) {
        this.fueleconomy = value;
    }

    /**
     * Gets the value of the fuelrange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelrange() {
        return fuelrange;
    }

    /**
     * Sets the value of the fuelrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelrange(Integer value) {
        this.fuelrange = value;
    }

    /**
     * Gets the value of the lpglevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLpglevel() {
        return lpglevel;
    }

    /**
     * Sets the value of the lpglevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLpglevel(Integer value) {
        this.lpglevel = value;
    }

    /**
     * Gets the value of the lpgrange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLpgrange() {
        return lpgrange;
    }

    /**
     * Sets the value of the lpgrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLpgrange(Integer value) {
        this.lpgrange = value;
    }

    /**
     * Gets the value of the kilometers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometers() {
        return kilometers;
    }

    /**
     * Sets the value of the kilometers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometers(Integer value) {
        this.kilometers = value;
    }

    /**
     * Gets the value of the servicerange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicerange() {
        return servicerange;
    }

    /**
     * Sets the value of the servicerange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicerange(Integer value) {
        this.servicerange = value;
    }

    /**
     * Gets the value of the servicedays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicedays() {
        return servicedays;
    }

    /**
     * Sets the value of the servicedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicedays(Integer value) {
        this.servicedays = value;
    }

    /**
     * Gets the value of the waterTempAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaterTempAlarm() {
        return waterTempAlarm;
    }

    /**
     * Sets the value of the waterTempAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaterTempAlarm(Boolean value) {
        this.waterTempAlarm = value;
    }

    /**
     * Gets the value of the oilTempAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOilTempAlarm() {
        return oilTempAlarm;
    }

    /**
     * Sets the value of the oilTempAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOilTempAlarm(Boolean value) {
        this.oilTempAlarm = value;
    }

    /**
     * Gets the value of the waterLevelAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaterLevelAlarm() {
        return waterLevelAlarm;
    }

    /**
     * Sets the value of the waterLevelAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaterLevelAlarm(Boolean value) {
        this.waterLevelAlarm = value;
    }

    /**
     * Gets the value of the oilLevelAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOilLevelAlarm() {
        return oilLevelAlarm;
    }

    /**
     * Sets the value of the oilLevelAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOilLevelAlarm(Boolean value) {
        this.oilLevelAlarm = value;
    }

    /**
     * Gets the value of the oilPressureAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOilPressureAlarm() {
        return oilPressureAlarm;
    }

    /**
     * Sets the value of the oilPressureAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOilPressureAlarm(Boolean value) {
        this.oilPressureAlarm = value;
    }

    /**
     * Gets the value of the gearOilTempAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGearOilTempAlarm() {
        return gearOilTempAlarm;
    }

    /**
     * Sets the value of the gearOilTempAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGearOilTempAlarm(Boolean value) {
        this.gearOilTempAlarm = value;
    }

    /**
     * Gets the value of the fluidPressureAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFluidPressureAlarm() {
        return fluidPressureAlarm;
    }

    /**
     * Sets the value of the fluidPressureAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFluidPressureAlarm(Boolean value) {
        this.fluidPressureAlarm = value;
    }

    /**
     * Gets the value of the brakeLevelAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrakeLevelAlarm() {
        return brakeLevelAlarm;
    }

    /**
     * Sets the value of the brakeLevelAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrakeLevelAlarm(Boolean value) {
        this.brakeLevelAlarm = value;
    }

    /**
     * Gets the value of the suspensionMajorAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspensionMajorAlarm() {
        return suspensionMajorAlarm;
    }

    /**
     * Sets the value of the suspensionMajorAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspensionMajorAlarm(Boolean value) {
        this.suspensionMajorAlarm = value;
    }

    /**
     * Gets the value of the brakePadAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrakePadAlarm() {
        return brakePadAlarm;
    }

    /**
     * Sets the value of the brakePadAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrakePadAlarm(Boolean value) {
        this.brakePadAlarm = value;
    }

    /**
     * Gets the value of the gearboxAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGearboxAlarm() {
        return gearboxAlarm;
    }

    /**
     * Sets the value of the gearboxAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGearboxAlarm(Boolean value) {
        this.gearboxAlarm = value;
    }

    /**
     * Gets the value of the eobdAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEobdAlarm() {
        return eobdAlarm;
    }

    /**
     * Sets the value of the eobdAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEobdAlarm(Boolean value) {
        this.eobdAlarm = value;
    }

    /**
     * Gets the value of the antiTheftAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAntiTheftAlarm() {
        return antiTheftAlarm;
    }

    /**
     * Sets the value of the antiTheftAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAntiTheftAlarm(Boolean value) {
        this.antiTheftAlarm = value;
    }

    /**
     * Gets the value of the tirePressureAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTirePressureAlarm() {
        return tirePressureAlarm;
    }

    /**
     * Sets the value of the tirePressureAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTirePressureAlarm(Boolean value) {
        this.tirePressureAlarm = value;
    }

    /**
     * Gets the value of the absAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbsAlarm() {
        return absAlarm;
    }

    /**
     * Sets the value of the absAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbsAlarm(Boolean value) {
        this.absAlarm = value;
    }

    /**
     * Gets the value of the espAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEspAlarm() {
        return espAlarm;
    }

    /**
     * Sets the value of the espAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEspAlarm(Boolean value) {
        this.espAlarm = value;
    }

    /**
     * Gets the value of the fpsFluidLevelAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFpsFluidLevelAlarm() {
        return fpsFluidLevelAlarm;
    }

    /**
     * Sets the value of the fpsFluidLevelAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFpsFluidLevelAlarm(Boolean value) {
        this.fpsFluidLevelAlarm = value;
    }

    /**
     * Gets the value of the fpsFullAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFpsFullAlarm() {
        return fpsFullAlarm;
    }

    /**
     * Sets the value of the fpsFullAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFpsFullAlarm(Boolean value) {
        this.fpsFullAlarm = value;
    }

    /**
     * Gets the value of the suspensionSpeedAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspensionSpeedAlarm() {
        return suspensionSpeedAlarm;
    }

    /**
     * Sets the value of the suspensionSpeedAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspensionSpeedAlarm(Boolean value) {
        this.suspensionSpeedAlarm = value;
    }

    /**
     * Gets the value of the suspension2Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspension2Alarm() {
        return suspension2Alarm;
    }

    /**
     * Sets the value of the suspension2Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspension2Alarm(Boolean value) {
        this.suspension2Alarm = value;
    }

    /**
     * Gets the value of the steeringAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSteeringAlarm() {
        return steeringAlarm;
    }

    /**
     * Sets the value of the steeringAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSteeringAlarm(Boolean value) {
        this.steeringAlarm = value;
    }

    /**
     * Gets the value of the parkBrakeAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkBrakeAlarm() {
        return parkBrakeAlarm;
    }

    /**
     * Sets the value of the parkBrakeAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkBrakeAlarm(Boolean value) {
        this.parkBrakeAlarm = value;
    }

    /**
     * Gets the value of the waterInFuelAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaterInFuelAlarm() {
        return waterInFuelAlarm;
    }

    /**
     * Sets the value of the waterInFuelAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaterInFuelAlarm(Boolean value) {
        this.waterInFuelAlarm = value;
    }

    /**
     * Gets the value of the engineAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineAlarm() {
        return engineAlarm;
    }

    /**
     * Sets the value of the engineAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineAlarm(Boolean value) {
        this.engineAlarm = value;
    }

    /**
     * Gets the value of the suspension3Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspension3Alarm() {
        return suspension3Alarm;
    }

    /**
     * Sets the value of the suspension3Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspension3Alarm(Boolean value) {
        this.suspension3Alarm = value;
    }

    /**
     * Gets the value of the steering2Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSteering2Alarm() {
        return steering2Alarm;
    }

    /**
     * Sets the value of the steering2Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSteering2Alarm(Boolean value) {
        this.steering2Alarm = value;
    }

    /**
     * Gets the value of the brakeAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrakeAlarm() {
        return brakeAlarm;
    }

    /**
     * Sets the value of the brakeAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrakeAlarm(Boolean value) {
        this.brakeAlarm = value;
    }

    /**
     * Gets the value of the airbagAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirbagAlarm() {
        return airbagAlarm;
    }

    /**
     * Sets the value of the airbagAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirbagAlarm(Boolean value) {
        this.airbagAlarm = value;
    }

    /**
     * Gets the value of the fpsFluid2Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFpsFluid2Alarm() {
        return fpsFluid2Alarm;
    }

    /**
     * Sets the value of the fpsFluid2Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFpsFluid2Alarm(Boolean value) {
        this.fpsFluid2Alarm = value;
    }

    /**
     * Gets the value of the batteryAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatteryAlarm() {
        return batteryAlarm;
    }

    /**
     * Sets the value of the batteryAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatteryAlarm(Boolean value) {
        this.batteryAlarm = value;
    }

    /**
     * Gets the value of the tireFLAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTireFLAlarm() {
        return tireFLAlarm;
    }

    /**
     * Sets the value of the tireFLAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTireFLAlarm(Boolean value) {
        this.tireFLAlarm = value;
    }

    /**
     * Gets the value of the tireFRAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTireFRAlarm() {
        return tireFRAlarm;
    }

    /**
     * Sets the value of the tireFRAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTireFRAlarm(Boolean value) {
        this.tireFRAlarm = value;
    }

    /**
     * Gets the value of the tireRRAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTireRRAlarm() {
        return tireRRAlarm;
    }

    /**
     * Sets the value of the tireRRAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTireRRAlarm(Boolean value) {
        this.tireRRAlarm = value;
    }

    /**
     * Gets the value of the tireRLAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTireRLAlarm() {
        return tireRLAlarm;
    }

    /**
     * Sets the value of the tireRLAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTireRLAlarm(Boolean value) {
        this.tireRLAlarm = value;
    }

}
