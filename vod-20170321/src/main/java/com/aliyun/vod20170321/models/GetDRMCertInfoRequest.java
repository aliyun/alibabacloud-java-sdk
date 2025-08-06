// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDRMCertInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetDRMCertInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDRMCertInfoRequest self = new GetDRMCertInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDRMCertInfoRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public GetDRMCertInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
