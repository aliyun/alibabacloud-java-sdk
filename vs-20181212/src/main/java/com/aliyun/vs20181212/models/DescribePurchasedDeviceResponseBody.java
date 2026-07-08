// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceResponseBody extends TeaModel {
    /**
     * <p>Device creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-12-10T21:00:00Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Device description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Space name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试空间</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33763****77224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Device name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2117*****0447</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Region where the space belongs, also known as the service center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Device registration code.</p>
     * 
     * <strong>example:</strong>
     * <p>12345*****67890</p>
     */
    @NameInMap("RegisterCode")
    public String registerCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Device child type. Valid values:</p>
     * <ul>
     * <li><p>bullet (bullet camera)</p>
     * </li>
     * <li><p>dome (dome camera)</p>
     * </li>
     * <li><p>ptz (PTZ)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dome</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>Device type. Valid values:</p>
     * <ul>
     * <li><p>ipc (camera)</p>
     * </li>
     * <li><p>platform</p>
     * </li>
     * <li><p>ied (intelligent device)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Device vendor.</p>
     * 
     * <strong>example:</strong>
     * <p>8yd*****qem</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribePurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDeviceResponseBody self = new DescribePurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDeviceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribePurchasedDeviceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePurchasedDeviceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedDeviceResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribePurchasedDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePurchasedDeviceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePurchasedDeviceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribePurchasedDeviceResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribePurchasedDeviceResponseBody setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public DescribePurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedDeviceResponseBody setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DescribePurchasedDeviceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePurchasedDeviceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
