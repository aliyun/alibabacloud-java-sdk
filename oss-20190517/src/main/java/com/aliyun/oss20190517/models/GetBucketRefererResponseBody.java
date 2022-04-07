// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketRefererResponseBody extends TeaModel {
    @NameInMap("AllowEmptyReferer")
    public Boolean allowEmptyReferer;

    @NameInMap("RefererList")
    public RefererList refererList;

    public static GetBucketRefererResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketRefererResponseBody self = new GetBucketRefererResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketRefererResponseBody setAllowEmptyReferer(Boolean allowEmptyReferer) {
        this.allowEmptyReferer = allowEmptyReferer;
        return this;
    }
    public Boolean getAllowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    public GetBucketRefererResponseBody setRefererList(RefererList refererList) {
        this.refererList = refererList;
        return this;
    }
    public RefererList getRefererList() {
        return this.refererList;
    }

    public static class RefererList extends TeaModel {
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
