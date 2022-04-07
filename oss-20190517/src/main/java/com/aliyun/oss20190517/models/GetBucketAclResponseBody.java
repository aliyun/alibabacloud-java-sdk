// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketAclResponseBody extends TeaModel {
    @NameInMap("AccessControlList")
    public AccessControlList accessControlList;

    @NameInMap("Owner")
    public Owner owner;

    public static GetBucketAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketAclResponseBody self = new GetBucketAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketAclResponseBody setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public AccessControlList getAccessControlList() {
        return this.accessControlList;
    }

    public GetBucketAclResponseBody setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public static class AccessControlList extends TeaModel {
        @NameInMap("Grant")
        public String grant;

        public static AccessControlList build(java.util.Map<String, ?> map) throws Exception {
            AccessControlList self = new AccessControlList();
            return TeaModel.build(map, self);
        }

        public AccessControlList setGrant(String grant) {
            this.grant = grant;
            return this;
        }
        public String getGrant() {
            return this.grant;
        }

    }

}
