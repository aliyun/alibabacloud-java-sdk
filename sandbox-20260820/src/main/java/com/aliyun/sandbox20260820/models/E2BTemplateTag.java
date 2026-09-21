// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BTemplateTag extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>b7e21c05-****</p>
     */
    @NameInMap("buildID")
    public String buildID;

    /**
     * <strong>example:</strong>
     * <p>2026-08-20T08:35:12Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("tag")
    public String tag;

    public static E2BTemplateTag build(java.util.Map<String, ?> map) throws Exception {
        E2BTemplateTag self = new E2BTemplateTag();
        return TeaModel.build(map, self);
    }

    public E2BTemplateTag setBuildID(String buildID) {
        this.buildID = buildID;
        return this;
    }
    public String getBuildID() {
        return this.buildID;
    }

    public E2BTemplateTag setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BTemplateTag setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
