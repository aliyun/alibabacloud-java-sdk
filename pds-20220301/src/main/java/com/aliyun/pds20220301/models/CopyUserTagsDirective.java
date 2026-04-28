// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CopyUserTagsDirective extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>all, include, none, exclude</p>
     */
    @NameInMap("directive")
    public String directive;

    @NameInMap("keys")
    public java.util.List<String> keys;

    public static CopyUserTagsDirective build(java.util.Map<String, ?> map) throws Exception {
        CopyUserTagsDirective self = new CopyUserTagsDirective();
        return TeaModel.build(map, self);
    }

    public CopyUserTagsDirective setDirective(String directive) {
        this.directive = directive;
        return this;
    }
    public String getDirective() {
        return this.directive;
    }

    public CopyUserTagsDirective setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

}
