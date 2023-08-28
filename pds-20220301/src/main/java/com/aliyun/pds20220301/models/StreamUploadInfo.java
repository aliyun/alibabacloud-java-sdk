// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class StreamUploadInfo extends TeaModel {
    @NameInMap("location")
    public String location;

    @NameInMap("part_info_list")
    public java.util.List<UploadPartInfo> partInfoList;

    @NameInMap("pre_rapid_upload")
    public Boolean preRapidUpload;

    @NameInMap("rapid_upload")
    public Boolean rapidUpload;

    @NameInMap("upload_id")
    public String uploadId;

    public static StreamUploadInfo build(java.util.Map<String, ?> map) throws Exception {
        StreamUploadInfo self = new StreamUploadInfo();
        return TeaModel.build(map, self);
    }

    public StreamUploadInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public StreamUploadInfo setPartInfoList(java.util.List<UploadPartInfo> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<UploadPartInfo> getPartInfoList() {
        return this.partInfoList;
    }

    public StreamUploadInfo setPreRapidUpload(Boolean preRapidUpload) {
        this.preRapidUpload = preRapidUpload;
        return this;
    }
    public Boolean getPreRapidUpload() {
        return this.preRapidUpload;
    }

    public StreamUploadInfo setRapidUpload(Boolean rapidUpload) {
        this.rapidUpload = rapidUpload;
        return this;
    }
    public Boolean getRapidUpload() {
        return this.rapidUpload;
    }

    public StreamUploadInfo setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
