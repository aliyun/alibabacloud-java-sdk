// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListUserClustersRequest extends TeaModel {
    @NameInMap("current")
    public String current;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("userID")
    public String userID;

    public static ListUserClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserClustersRequest self = new ListUserClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListUserClustersRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public ListUserClustersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUserClustersRequest setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
