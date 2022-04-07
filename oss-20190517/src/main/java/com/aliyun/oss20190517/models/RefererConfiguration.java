// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RefererConfiguration extends TeaModel {
    // 是否允许Referer字段为空的请求访问
    @NameInMap("AllowEmptyReferer")
    public Boolean allowEmptyReferer;

    // description
    @NameInMap("AllowTruncateQueryString")
    public Boolean allowTruncateQueryString;

    // 保存Referer访问白名单
    @NameInMap("RefererList")
    public RefererList refererList;

    public static RefererConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RefererConfiguration self = new RefererConfiguration();
        return TeaModel.build(map, self);
    }

    public RefererConfiguration setAllowEmptyReferer(Boolean allowEmptyReferer) {
        this.allowEmptyReferer = allowEmptyReferer;
        return this;
    }
    public Boolean getAllowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    public RefererConfiguration setAllowTruncateQueryString(Boolean allowTruncateQueryString) {
        this.allowTruncateQueryString = allowTruncateQueryString;
        return this;
    }
    public Boolean getAllowTruncateQueryString() {
        return this.allowTruncateQueryString;
    }

    public RefererConfiguration setRefererList(RefererList refererList) {
        this.refererList = refererList;
        return this;
    }
    public RefererList getRefererList() {
        return this.refererList;
    }

    public static class RefererList extends TeaModel {
        // 指定一条Referer访问白名单
        @NameInMap("Referer")
        public java.util.List<String> referer;

        public static RefererList build(java.util.Map<String, ?> map) throws Exception {
            RefererList self = new RefererList();
            return TeaModel.build(map, self);
        }

        public RefererList setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

    }

}
