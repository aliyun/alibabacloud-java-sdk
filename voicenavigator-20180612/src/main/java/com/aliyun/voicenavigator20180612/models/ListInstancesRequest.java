// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("InstanceIdListJsonString")
    public String instanceIdListJsonString;

    @NameInMap("Name")
    public String name;

    @NameInMap("NluServiceTypeListJsonString")
    public String nluServiceTypeListJsonString;

    @NameInMap("Number")
    public String number;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("UnionInstanceId")
    public String unionInstanceId;

    @NameInMap("UnionSource")
    public String unionSource;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setInstanceIdListJsonString(String instanceIdListJsonString) {
        this.instanceIdListJsonString = instanceIdListJsonString;
        return this;
    }
    public String getInstanceIdListJsonString() {
        return this.instanceIdListJsonString;
    }

    public ListInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstancesRequest setNluServiceTypeListJsonString(String nluServiceTypeListJsonString) {
        this.nluServiceTypeListJsonString = nluServiceTypeListJsonString;
        return this;
    }
    public String getNluServiceTypeListJsonString() {
        return this.nluServiceTypeListJsonString;
    }

    public ListInstancesRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesRequest setUnionInstanceId(String unionInstanceId) {
        this.unionInstanceId = unionInstanceId;
        return this;
    }
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    public ListInstancesRequest setUnionSource(String unionSource) {
        this.unionSource = unionSource;
        return this;
    }
    public String getUnionSource() {
        return this.unionSource;
    }

}
