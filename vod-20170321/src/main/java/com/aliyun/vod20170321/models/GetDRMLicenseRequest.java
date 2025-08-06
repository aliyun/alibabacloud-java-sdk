// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDRMLicenseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CDMData")
    public String CDMData;

    @NameInMap("CertId")
    public String certId;

    @NameInMap("DRMType")
    public String DRMType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetDRMLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseRequest self = new GetDRMLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseRequest setCDMData(String CDMData) {
        this.CDMData = CDMData;
        return this;
    }
    public String getCDMData() {
        return this.CDMData;
    }

    public GetDRMLicenseRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public GetDRMLicenseRequest setDRMType(String DRMType) {
        this.DRMType = DRMType;
        return this;
    }
    public String getDRMType() {
        return this.DRMType;
    }

    public GetDRMLicenseRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
