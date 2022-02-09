// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicTableRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("LogicDatabaseId")
    public String logicDatabaseId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOmsLogicTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicTableRequest self = new ListOmsLogicTableRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicTableRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListOmsLogicTableRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ListOmsLogicTableRequest setLogicDatabaseId(String logicDatabaseId) {
        this.logicDatabaseId = logicDatabaseId;
        return this;
    }
    public String getLogicDatabaseId() {
        return this.logicDatabaseId;
    }

    public ListOmsLogicTableRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsLogicTableRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
