// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    /**
     * <p>GB-compliant alarm method to subscribe to. Valid values:</p>
     * <ul>
     * <li><p>0 (all)</p>
     * </li>
     * <li><p>5 (video alarm)</p>
     * </li>
     * <li><p>7 (other alarms)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>An empty value means no subscription.</p>
     * </li>
     * <li><p>You can specify multiple values, separated by commas (,).</p>
     * </li>
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
     * <p>Whether to enable location subscription for the device. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPos")
    public Boolean autoPos;

    /**
     * <p>Whether to automatically start the stream. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>Device description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ID of the folder that contains the device.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****488-cn-qingdao</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Device serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>7D0*****4C0</p>
     */
    @NameInMap("Dsn")
    public String dsn;

    /**
     * <p>GB-compliant device ID.</p>
     * <blockquote>
     * <p>This parameter applies only to GB-compliant protocols.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>31000000****00000002</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>ID of the space that contains the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Device IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The dimension of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>119.20</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <p>Device longitude.</p>
     * 
     * <strong>example:</strong>
     * <p>45.00</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>Device name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Additional device parameters, formatted as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>ID of the parent device. For example, the ID of the platform that hosts the camera.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>Device password.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Device port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <p>Location subscription interval, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("PosInterval")
    public Long posInterval;

    /**
     * <p>Device type. Valid values:</p>
     * <ul>
     * <li><p>ipc (camera)</p>
     * </li>
     * <li><p>platform (platform)</p>
     * </li>
     * <li><p>ied (intelligent device)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Stream URL on the device.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://xxx/xxx</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>Device username.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>Device vendor.</p>
     * 
     * <strong>example:</strong>
     * <p>公司A</p>
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
