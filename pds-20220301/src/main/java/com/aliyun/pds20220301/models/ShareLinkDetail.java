// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ShareLinkDetail extends TeaModel {
    @NameInMap("enable_office_editable")
    public Boolean enableOfficeEditable;

    public static ShareLinkDetail build(java.util.Map<String, ?> map) throws Exception {
        ShareLinkDetail self = new ShareLinkDetail();
        return TeaModel.build(map, self);
    }

    public ShareLinkDetail setEnableOfficeEditable(Boolean enableOfficeEditable) {
        this.enableOfficeEditable = enableOfficeEditable;
        return this;
    }
    public Boolean getEnableOfficeEditable() {
        return this.enableOfficeEditable;
    }

}
