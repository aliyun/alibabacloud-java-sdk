// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectAclResponseBody extends TeaModel {
    @NameInMap("AccessControlList")
    public AccessControlList accessControlList;

    @NameInMap("Owner")
    public Owner owner;

    public static GetObjectAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetObjectAclResponseBody self = new GetObjectAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetObjectAclResponseBody setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public AccessControlList getAccessControlList() {
        return this.accessControlList;
    }

    public GetObjectAclResponseBody setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public static class AccessControlList extends TeaModel {
        @NameInMap("Grant")
        public String ACL;

        public static AccessControlList build(java.util.Map<String, ?> map) throws Exception {
            AccessControlList self = new AccessControlList();
            return TeaModel.build(map, self);
        }

        public AccessControlList setACL(String ACL) {
            this.ACL = ACL;
            return this;
        }
        public String getACL() {
            return this.ACL;
        }

    }

}
