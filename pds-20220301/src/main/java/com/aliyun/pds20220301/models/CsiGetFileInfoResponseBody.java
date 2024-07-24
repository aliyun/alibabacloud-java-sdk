// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CsiGetFileInfoResponseBody extends TeaModel {
    @NameInMap("investigation_info")
    public InvestigationInfo investigationInfo;

    /**
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("url")
    public String url;

    public static CsiGetFileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CsiGetFileInfoResponseBody self = new CsiGetFileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CsiGetFileInfoResponseBody setInvestigationInfo(InvestigationInfo investigationInfo) {
        this.investigationInfo = investigationInfo;
        return this;
    }
    public InvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    public CsiGetFileInfoResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
