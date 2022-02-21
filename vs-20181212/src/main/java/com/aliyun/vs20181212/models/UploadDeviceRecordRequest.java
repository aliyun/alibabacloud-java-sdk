// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadDeviceRecordRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SearchCriteria")
    public String searchCriteria;

    @NameInMap("StreamId")
    public String streamId;

    @NameInMap("UploadId")
    public String uploadId;

    @NameInMap("UploadMode")
    public String uploadMode;

    @NameInMap("UploadParams")
    public String uploadParams;

    @NameInMap("UploadType")
    public String uploadType;

    public static UploadDeviceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceRecordRequest self = new UploadDeviceRecordRequest();
        return TeaModel.build(map, self);
    }

    public UploadDeviceRecordRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UploadDeviceRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadDeviceRecordRequest setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
        return this;
    }
    public String getSearchCriteria() {
        return this.searchCriteria;
    }

    public UploadDeviceRecordRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public UploadDeviceRecordRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public UploadDeviceRecordRequest setUploadMode(String uploadMode) {
        this.uploadMode = uploadMode;
        return this;
    }
    public String getUploadMode() {
        return this.uploadMode;
    }

    public UploadDeviceRecordRequest setUploadParams(String uploadParams) {
        this.uploadParams = uploadParams;
        return this;
    }
    public String getUploadParams() {
        return this.uploadParams;
    }

    public UploadDeviceRecordRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
