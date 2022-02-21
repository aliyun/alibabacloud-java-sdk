// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    @NameInMap("AlarmMethod")
    public String alarmMethod;

    @NameInMap("AutoPos")
    public Boolean autoPos;

    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("Description")
    public String description;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("Dsn")
    public String dsn;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Params")
    public String params;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Long port;

    @NameInMap("PosInterval")
    public Long posInterval;

    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    @NameInMap("Username")
    public String username;

    @NameInMap("Vendor")
    public String vendor;

    public static CreateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRequest self = new CreateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRequest setAlarmMethod(String alarmMethod) {
        this.alarmMethod = alarmMethod;
        return this;
    }
    public String getAlarmMethod() {
        return this.alarmMethod;
    }

    public CreateDeviceRequest setAutoPos(Boolean autoPos) {
        this.autoPos = autoPos;
        return this;
    }
    public Boolean getAutoPos() {
        return this.autoPos;
    }

    public CreateDeviceRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public CreateDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDeviceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDeviceRequest setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public CreateDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateDeviceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CreateDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CreateDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDeviceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateDeviceRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDeviceRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public CreateDeviceRequest setPosInterval(Long posInterval) {
        this.posInterval = posInterval;
        return this;
    }
    public Long getPosInterval() {
        return this.posInterval;
    }

    public CreateDeviceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDeviceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateDeviceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
