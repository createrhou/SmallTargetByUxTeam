package com.uxteam.starget.bmob_sys_pkg;

import cn.bmob.v3.BmobUser;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class User extends BmobUser{
    @Id
    private long id;

    private String cachePwd;
    private String nickName;
    private String signature;
    private int supervisionAbility;
    private int supervTNumber;
    private int supervFNumber;
    private int executiveAbility;
    private int targetNumbers;
    private int targetTNumber;
    private int targetFNumber;
    private int todayTargets;
    private int todaySupervision;
    private String avatarNetPath;

    public String getAvatarNetPath() {
        return avatarNetPath;
    }

    public void setAvatarNetPath(String avatarNetPath) {
        this.avatarNetPath = avatarNetPath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
    }

    private String avatarUri;
    public int getTodayTargets() {
        return todayTargets;
    }

    public void setTodayTargets(int todayTargets) {
        this.todayTargets = todayTargets;
    }

    public int getTodaySupervision() {
        return todaySupervision;
    }

    public void setTodaySupervision(int todaySupervision) {
        this.todaySupervision = todaySupervision;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getSupervisionAbility() {
        return supervisionAbility;
    }

    public void setSupervisionAbility(int supervisionAbility) {
        this.supervisionAbility = supervisionAbility;
    }

    public int getSupervTNumber() {
        return supervTNumber;
    }

    public void setSupervTNumber(int supervTNumber) {
        this.supervTNumber = supervTNumber;
    }

    public int getSupervFNumber() {
        return supervFNumber;
    }

    public void setSupervFNumber(int supervFNumber) {
        this.supervFNumber = supervFNumber;
    }

    public int getExecutiveAbility() {
        return executiveAbility;
    }

    public void setExecutiveAbility(int executiveAbility) {
        this.executiveAbility = executiveAbility;
    }

    public int getTargetNumbers() {
        return targetNumbers;
    }

    public void setTargetNumbers(int targetNumbers) {
        this.targetNumbers = targetNumbers;
    }

    public int getTargetTNumber() {
        return targetTNumber;
    }

    public void setTargetTNumber(int targetTNumber) {
        this.targetTNumber = targetTNumber;
    }

    public int getTargetFNumber() {
        return targetFNumber;
    }

    public void setTargetFNumber(int targetFNumber) {
        this.targetFNumber = targetFNumber;
    }
    public String getCachePwd() {
        return cachePwd;
    }

    public void setCachePwd(String cachePwd) {
        this.cachePwd = cachePwd;
    }
}
