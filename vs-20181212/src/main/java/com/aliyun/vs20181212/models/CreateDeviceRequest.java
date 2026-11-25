// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    /**
     * <p>The subscribed national standard alarm methods. Valid values:</p>
     * <ul>
     * <li>0: All.</li>
     * <li>5: Video alarm.</li>
     * <li>7: Other alarms.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>An empty value indicates no subscription.</li>
     * <li>Multiple values are supported and must be separated by commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlarmMethod")
    public String alarmMethod;

    @NameInMap("AutoDirectory")
    public Boolean autoDirectory;

    /**
     * <p>Specifies whether to enable device location subscription. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPos")
    public Boolean autoPos;

    /**
     * <p>Specifies whether to automatically start the stream. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>The description of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx intersection camera</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the folder to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****488-cn-qingdao</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The serial number of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>7D0*****4C0</p>
     */
    @NameInMap("Dsn")
    public String dsn;

    /**
     * <p>The national standard ID of the device.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the national standard protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>31000000****00000002</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>The ID of the workspace to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The IP address of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The latitude of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>119.20</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <p>The longitude of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>45.00</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>The name of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx intersection camera</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The other parameters of the device, in the format of a JSON serialized string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the parent device, such as the ID of the platform to which a camera belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The password of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <p>The location subscription interval, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("PosInterval")
    public Long posInterval;

    /**
     * <p>The type of the device. Valid values:</p>
     * <ul>
     * <li>ipc: IP camera.</li>
     * <li>platform: Platform.</li>
     * <li>ied: Intelligent device.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The URL of the stream on the device.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://xxx/xxx</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The username of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The vendor of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>Company A</p>
     */
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

    public CreateDeviceRequest setAutoDirectory(Boolean autoDirectory) {
        this.autoDirectory = autoDirectory;
        return this;
    }
    public Boolean getAutoDirectory() {
        return this.autoDirectory;
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
