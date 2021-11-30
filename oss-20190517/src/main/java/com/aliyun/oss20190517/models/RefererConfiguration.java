// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RefererConfiguration extends TeaModel {
    // 是否允许Referer字段为空的请求访问
    @NameInMap("AllowEmptyReferer")
    public Boolean allowEmptyReferer;

    // 保存Referer访问白名单
    @NameInMap("RefererList")
    public RefererConfigurationRefererList refererList;

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

    public RefererConfiguration setRefererList(RefererConfigurationRefererList refererList) {
        this.refererList = refererList;
        return this;
    }
    public RefererConfigurationRefererList getRefererList() {
        return this.refererList;
    }

    public static class RefererConfigurationRefererList extends TeaModel {
        // 指定一条Referer访问白名单
        @NameInMap("Referer")
        public java.util.List<String> referer;

        public static RefererConfigurationRefererList build(java.util.Map<String, ?> map) throws Exception {
            RefererConfigurationRefererList self = new RefererConfigurationRefererList();
            return TeaModel.build(map, self);
        }

        public RefererConfigurationRefererList setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

    }

}
