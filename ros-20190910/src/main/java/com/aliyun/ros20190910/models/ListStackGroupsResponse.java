// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("StackGroups")
    @Validation(required = true)
    public java.util.List<ListStackGroupsResponseStackGroups> stackGroups;

    public static ListStackGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponse self = new ListStackGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackGroupsResponseStackGroups extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("StackGroupDriftStatus")
        @Validation(required = true)
        public String stackGroupDriftStatus;

        public static ListStackGroupsResponseStackGroups build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseStackGroups self = new ListStackGroupsResponseStackGroups();
            return TeaModel.build(map, self);
        }

    }

}
