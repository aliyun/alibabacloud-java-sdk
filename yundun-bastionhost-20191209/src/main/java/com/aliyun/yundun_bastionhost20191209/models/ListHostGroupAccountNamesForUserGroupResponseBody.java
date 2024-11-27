// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The names of host accounts returned.</p>
     */
    @NameInMap("HostAccountNames")
    public java.util.List<String> hostAccountNames;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHostGroupAccountNamesForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserGroupResponseBody self = new ListHostGroupAccountNamesForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserGroupResponseBody setHostAccountNames(java.util.List<String> hostAccountNames) {
        this.hostAccountNames = hostAccountNames;
        return this;
    }
    public java.util.List<String> getHostAccountNames() {
        return this.hostAccountNames;
    }

    public ListHostGroupAccountNamesForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
