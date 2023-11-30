// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ShareLinkConfig extends TeaModel {
    @NameInMap("enable_share_link_office_edit")
    public Boolean enableShareLinkOfficeEdit;

    public static ShareLinkConfig build(java.util.Map<String, ?> map) throws Exception {
        ShareLinkConfig self = new ShareLinkConfig();
        return TeaModel.build(map, self);
    }

    public ShareLinkConfig setEnableShareLinkOfficeEdit(Boolean enableShareLinkOfficeEdit) {
        this.enableShareLinkOfficeEdit = enableShareLinkOfficeEdit;
        return this;
    }
    public Boolean getEnableShareLinkOfficeEdit() {
        return this.enableShareLinkOfficeEdit;
    }

}
