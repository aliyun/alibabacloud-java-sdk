// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceConfigsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigsResponseBody self = new GetDeviceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceConfigsResponseBody setData(GetDeviceConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceConfigsResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceConfigsResponseBodyDataCustomResourcePackage extends TeaModel {
        @NameInMap("ConfigAboutLogo")
        public String configAboutLogo;

        @NameInMap("DesktopWallpaper")
        public String desktopWallpaper;

        @NameInMap("LoginPageBackground")
        public String loginPageBackground;

        @NameInMap("LoginPageLogo")
        public String loginPageLogo;

        @NameInMap("PersonalCenterLogo")
        public String personalCenterLogo;

        @NameInMap("StartLogo")
        public String startLogo;

        @NameInMap("StartMenuLogo")
        public String startMenuLogo;

        @NameInMap("UpgradeLogo")
        public String upgradeLogo;

        public static GetDeviceConfigsResponseBodyDataCustomResourcePackage build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigsResponseBodyDataCustomResourcePackage self = new GetDeviceConfigsResponseBodyDataCustomResourcePackage();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setConfigAboutLogo(String configAboutLogo) {
            this.configAboutLogo = configAboutLogo;
            return this;
        }
        public String getConfigAboutLogo() {
            return this.configAboutLogo;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setDesktopWallpaper(String desktopWallpaper) {
            this.desktopWallpaper = desktopWallpaper;
            return this;
        }
        public String getDesktopWallpaper() {
            return this.desktopWallpaper;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setLoginPageBackground(String loginPageBackground) {
            this.loginPageBackground = loginPageBackground;
            return this;
        }
        public String getLoginPageBackground() {
            return this.loginPageBackground;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setLoginPageLogo(String loginPageLogo) {
            this.loginPageLogo = loginPageLogo;
            return this;
        }
        public String getLoginPageLogo() {
            return this.loginPageLogo;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setPersonalCenterLogo(String personalCenterLogo) {
            this.personalCenterLogo = personalCenterLogo;
            return this;
        }
        public String getPersonalCenterLogo() {
            return this.personalCenterLogo;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setStartLogo(String startLogo) {
            this.startLogo = startLogo;
            return this;
        }
        public String getStartLogo() {
            return this.startLogo;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setStartMenuLogo(String startMenuLogo) {
            this.startMenuLogo = startMenuLogo;
            return this;
        }
        public String getStartMenuLogo() {
            return this.startMenuLogo;
        }

        public GetDeviceConfigsResponseBodyDataCustomResourcePackage setUpgradeLogo(String upgradeLogo) {
            this.upgradeLogo = upgradeLogo;
            return this;
        }
        public String getUpgradeLogo() {
            return this.upgradeLogo;
        }

    }

    public static class GetDeviceConfigsResponseBodyData extends TeaModel {
        @NameInMap("AutoLockScreenTime")
        public Integer autoLockScreenTime;

        @NameInMap("AutoLogin")
        public Integer autoLogin;

        @NameInMap("AutoUpdate")
        public Integer autoUpdate;

        @NameInMap("CustomIdleAction")
        public Integer customIdleAction;

        @NameInMap("CustomPowerOn")
        public Integer customPowerOn;

        @NameInMap("CustomResourcePackage")
        public GetDeviceConfigsResponseBodyDataCustomResourcePackage customResourcePackage;

        @NameInMap("DefinePowerButton")
        public Integer definePowerButton;

        @NameInMap("DeviceLock")
        public Integer deviceLock;

        @NameInMap("DisplayLayout")
        public String displayLayout;

        @NameInMap("DisplayResolution")
        public String displayResolution;

        @NameInMap("DisplayScaleRatio")
        public String displayScaleRatio;

        @NameInMap("EnableAdb")
        public Integer enableAdb;

        @NameInMap("EnableAutoLockScreen")
        public Integer enableAutoLockScreen;

        @NameInMap("EnableBluetooth")
        public Integer enableBluetooth;

        @NameInMap("EnableLockScreenPassword")
        public Integer enableLockScreenPassword;

        @NameInMap("EnableModifyPassword")
        public Integer enableModifyPassword;

        @NameInMap("EnableScheduledPowerOff")
        public Integer enableScheduledPowerOff;

        @NameInMap("EnableUnlockPassword")
        public Integer enableUnlockPassword;

        @NameInMap("EnableWlan")
        public Integer enableWlan;

        @NameInMap("IdleTime")
        public Integer idleTime;

        @NameInMap("LocalUsbPrint")
        public Integer localUsbPrint;

        @NameInMap("LockPassword")
        public String lockPassword;

        @NameInMap("ScheduledPowerOff")
        public String scheduledPowerOff;

        @NameInMap("SecureNetworkType")
        public String secureNetworkType;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("SleepTime")
        public Integer sleepTime;

        @NameInMap("Urcl")
        public String urcl;

        @NameInMap("UsbStorage")
        public Integer usbStorage;

        @NameInMap("UserCustomId")
        public String userCustomId;

        @NameInMap("Uuid")
        public String uuid;

        public static GetDeviceConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigsResponseBodyData self = new GetDeviceConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigsResponseBodyData setAutoLockScreenTime(Integer autoLockScreenTime) {
            this.autoLockScreenTime = autoLockScreenTime;
            return this;
        }
        public Integer getAutoLockScreenTime() {
            return this.autoLockScreenTime;
        }

        public GetDeviceConfigsResponseBodyData setAutoLogin(Integer autoLogin) {
            this.autoLogin = autoLogin;
            return this;
        }
        public Integer getAutoLogin() {
            return this.autoLogin;
        }

        public GetDeviceConfigsResponseBodyData setAutoUpdate(Integer autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public Integer getAutoUpdate() {
            return this.autoUpdate;
        }

        public GetDeviceConfigsResponseBodyData setCustomIdleAction(Integer customIdleAction) {
            this.customIdleAction = customIdleAction;
            return this;
        }
        public Integer getCustomIdleAction() {
            return this.customIdleAction;
        }

        public GetDeviceConfigsResponseBodyData setCustomPowerOn(Integer customPowerOn) {
            this.customPowerOn = customPowerOn;
            return this;
        }
        public Integer getCustomPowerOn() {
            return this.customPowerOn;
        }

        public GetDeviceConfigsResponseBodyData setCustomResourcePackage(GetDeviceConfigsResponseBodyDataCustomResourcePackage customResourcePackage) {
            this.customResourcePackage = customResourcePackage;
            return this;
        }
        public GetDeviceConfigsResponseBodyDataCustomResourcePackage getCustomResourcePackage() {
            return this.customResourcePackage;
        }

        public GetDeviceConfigsResponseBodyData setDefinePowerButton(Integer definePowerButton) {
            this.definePowerButton = definePowerButton;
            return this;
        }
        public Integer getDefinePowerButton() {
            return this.definePowerButton;
        }

        public GetDeviceConfigsResponseBodyData setDeviceLock(Integer deviceLock) {
            this.deviceLock = deviceLock;
            return this;
        }
        public Integer getDeviceLock() {
            return this.deviceLock;
        }

        public GetDeviceConfigsResponseBodyData setDisplayLayout(String displayLayout) {
            this.displayLayout = displayLayout;
            return this;
        }
        public String getDisplayLayout() {
            return this.displayLayout;
        }

        public GetDeviceConfigsResponseBodyData setDisplayResolution(String displayResolution) {
            this.displayResolution = displayResolution;
            return this;
        }
        public String getDisplayResolution() {
            return this.displayResolution;
        }

        public GetDeviceConfigsResponseBodyData setDisplayScaleRatio(String displayScaleRatio) {
            this.displayScaleRatio = displayScaleRatio;
            return this;
        }
        public String getDisplayScaleRatio() {
            return this.displayScaleRatio;
        }

        public GetDeviceConfigsResponseBodyData setEnableAdb(Integer enableAdb) {
            this.enableAdb = enableAdb;
            return this;
        }
        public Integer getEnableAdb() {
            return this.enableAdb;
        }

        public GetDeviceConfigsResponseBodyData setEnableAutoLockScreen(Integer enableAutoLockScreen) {
            this.enableAutoLockScreen = enableAutoLockScreen;
            return this;
        }
        public Integer getEnableAutoLockScreen() {
            return this.enableAutoLockScreen;
        }

        public GetDeviceConfigsResponseBodyData setEnableBluetooth(Integer enableBluetooth) {
            this.enableBluetooth = enableBluetooth;
            return this;
        }
        public Integer getEnableBluetooth() {
            return this.enableBluetooth;
        }

        public GetDeviceConfigsResponseBodyData setEnableLockScreenPassword(Integer enableLockScreenPassword) {
            this.enableLockScreenPassword = enableLockScreenPassword;
            return this;
        }
        public Integer getEnableLockScreenPassword() {
            return this.enableLockScreenPassword;
        }

        public GetDeviceConfigsResponseBodyData setEnableModifyPassword(Integer enableModifyPassword) {
            this.enableModifyPassword = enableModifyPassword;
            return this;
        }
        public Integer getEnableModifyPassword() {
            return this.enableModifyPassword;
        }

        public GetDeviceConfigsResponseBodyData setEnableScheduledPowerOff(Integer enableScheduledPowerOff) {
            this.enableScheduledPowerOff = enableScheduledPowerOff;
            return this;
        }
        public Integer getEnableScheduledPowerOff() {
            return this.enableScheduledPowerOff;
        }

        public GetDeviceConfigsResponseBodyData setEnableUnlockPassword(Integer enableUnlockPassword) {
            this.enableUnlockPassword = enableUnlockPassword;
            return this;
        }
        public Integer getEnableUnlockPassword() {
            return this.enableUnlockPassword;
        }

        public GetDeviceConfigsResponseBodyData setEnableWlan(Integer enableWlan) {
            this.enableWlan = enableWlan;
            return this;
        }
        public Integer getEnableWlan() {
            return this.enableWlan;
        }

        public GetDeviceConfigsResponseBodyData setIdleTime(Integer idleTime) {
            this.idleTime = idleTime;
            return this;
        }
        public Integer getIdleTime() {
            return this.idleTime;
        }

        public GetDeviceConfigsResponseBodyData setLocalUsbPrint(Integer localUsbPrint) {
            this.localUsbPrint = localUsbPrint;
            return this;
        }
        public Integer getLocalUsbPrint() {
            return this.localUsbPrint;
        }

        public GetDeviceConfigsResponseBodyData setLockPassword(String lockPassword) {
            this.lockPassword = lockPassword;
            return this;
        }
        public String getLockPassword() {
            return this.lockPassword;
        }

        public GetDeviceConfigsResponseBodyData setScheduledPowerOff(String scheduledPowerOff) {
            this.scheduledPowerOff = scheduledPowerOff;
            return this;
        }
        public String getScheduledPowerOff() {
            return this.scheduledPowerOff;
        }

        public GetDeviceConfigsResponseBodyData setSecureNetworkType(String secureNetworkType) {
            this.secureNetworkType = secureNetworkType;
            return this;
        }
        public String getSecureNetworkType() {
            return this.secureNetworkType;
        }

        public GetDeviceConfigsResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public GetDeviceConfigsResponseBodyData setSleepTime(Integer sleepTime) {
            this.sleepTime = sleepTime;
            return this;
        }
        public Integer getSleepTime() {
            return this.sleepTime;
        }

        public GetDeviceConfigsResponseBodyData setUrcl(String urcl) {
            this.urcl = urcl;
            return this;
        }
        public String getUrcl() {
            return this.urcl;
        }

        public GetDeviceConfigsResponseBodyData setUsbStorage(Integer usbStorage) {
            this.usbStorage = usbStorage;
            return this;
        }
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

        public GetDeviceConfigsResponseBodyData setUserCustomId(String userCustomId) {
            this.userCustomId = userCustomId;
            return this;
        }
        public String getUserCustomId() {
            return this.userCustomId;
        }

        public GetDeviceConfigsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
