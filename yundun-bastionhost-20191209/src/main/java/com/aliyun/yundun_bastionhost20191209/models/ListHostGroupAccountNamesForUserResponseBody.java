// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserResponseBody extends TeaModel {
    /**
     * <p>The names of host accounts returned.</p>
     */
    @NameInMap("HostAccountNames")
    public java.util.List<String> hostAccountNames;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHostGroupAccountNamesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserResponseBody self = new ListHostGroupAccountNamesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserResponseBody setHostAccountNames(java.util.List<String> hostAccountNames) {
        this.hostAccountNames = hostAccountNames;
        return this;
    }
    public java.util.List<String> getHostAccountNames() {
        return this.hostAccountNames;
    }

    public ListHostGroupAccountNamesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
