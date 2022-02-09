// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseInstancesRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOmsDatabaseInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseInstancesRequest self = new ListOmsDatabaseInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseInstancesRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListOmsDatabaseInstancesRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ListOmsDatabaseInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsDatabaseInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
