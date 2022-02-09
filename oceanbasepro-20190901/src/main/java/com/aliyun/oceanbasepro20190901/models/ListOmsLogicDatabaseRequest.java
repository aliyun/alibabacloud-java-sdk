// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicDatabaseRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOmsLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicDatabaseRequest self = new ListOmsLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicDatabaseRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListOmsLogicDatabaseRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ListOmsLogicDatabaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsLogicDatabaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
