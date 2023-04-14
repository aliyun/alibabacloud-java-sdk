// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CsiGetFileInfoResponseBody extends TeaModel {
    @NameInMap("investigation_info")
    public InvestigationInfo investigationInfo;

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
