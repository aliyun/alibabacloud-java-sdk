// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaSinglecoverageRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("Source")
    public String source;

    public static UploadLinkeLinkaSinglecoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaSinglecoverageRequest self = new UploadLinkeLinkaSinglecoverageRequest();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaSinglecoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UploadLinkeLinkaSinglecoverageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
