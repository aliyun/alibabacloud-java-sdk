// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataRequest extends TeaModel {
    /**
     * <p>The application ID. If you have activated the multi-application feature, you can specify this parameter to query the storage usage of a specific application. If you do not specify this parameter, the total storage usage of all applications is returned. You can obtain the value of this parameter from the AppId response parameter of the <a href="~~CreateAppInfo~~">CreateAppInfo</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/113601.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The storage region. By default, data of all regions is returned. You can specify multiple regions separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>cn-shanghai</strong>: Shanghai.</li>
     * <li><strong>cn-beijing</strong>: Beijing.</li>
     * <li><strong>eu-central-1</strong>: Germany.</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start of the time range to query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T14:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage name (Alibaba Cloud OSS bucket name). By default, data of all storage buckets is returned. You can specify multiple storage names separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>bucket</p>
     */
    @NameInMap("Storage")
    public String storage;

    /**
     * <p>The storage type. Set the value to <strong>OSS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeVodStorageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStorageDataRequest self = new DescribeVodStorageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodStorageDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodStorageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodStorageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodStorageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodStorageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodStorageDataRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public DescribeVodStorageDataRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
