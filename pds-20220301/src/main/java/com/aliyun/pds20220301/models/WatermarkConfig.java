// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class WatermarkConfig extends TeaModel {
    @NameInMap("display_access_user_name")
    public Boolean displayAccessUserName;

    @NameInMap("display_shareLink_creator_name")
    public Boolean displayShareLinkCreatorName;

    @NameInMap("enable_doc_preview")
    public Boolean enableDocPreview;

    @NameInMap("enable_on_preview")
    public Boolean enableOnPreview;

    public static WatermarkConfig build(java.util.Map<String, ?> map) throws Exception {
        WatermarkConfig self = new WatermarkConfig();
        return TeaModel.build(map, self);
    }

    public WatermarkConfig setDisplayAccessUserName(Boolean displayAccessUserName) {
        this.displayAccessUserName = displayAccessUserName;
        return this;
    }
    public Boolean getDisplayAccessUserName() {
        return this.displayAccessUserName;
    }

    public WatermarkConfig setDisplayShareLinkCreatorName(Boolean displayShareLinkCreatorName) {
        this.displayShareLinkCreatorName = displayShareLinkCreatorName;
        return this;
    }
    public Boolean getDisplayShareLinkCreatorName() {
        return this.displayShareLinkCreatorName;
    }

    public WatermarkConfig setEnableDocPreview(Boolean enableDocPreview) {
        this.enableDocPreview = enableDocPreview;
        return this;
    }
    public Boolean getEnableDocPreview() {
        return this.enableDocPreview;
    }

    public WatermarkConfig setEnableOnPreview(Boolean enableOnPreview) {
        this.enableOnPreview = enableOnPreview;
        return this;
    }
    public Boolean getEnableOnPreview() {
        return this.enableOnPreview;
    }

}
