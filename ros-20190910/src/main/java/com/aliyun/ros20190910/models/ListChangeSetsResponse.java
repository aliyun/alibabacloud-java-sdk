// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("ChangeSets")
    @Validation(required = true)
    public java.util.List<ListChangeSetsResponseChangeSets> changeSets;

    public static ListChangeSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponse self = new ListChangeSetsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListChangeSetsResponseChangeSets extends TeaModel {
        @NameInMap("ChangeSetId")
        @Validation(required = true)
        public String changeSetId;

        @NameInMap("ChangeSetName")
        @Validation(required = true)
        public String changeSetName;

        @NameInMap("ChangeSetType")
        @Validation(required = true)
        public String changeSetType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ExecutionStatus")
        @Validation(required = true)
        public String executionStatus;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        public static ListChangeSetsResponseChangeSets build(java.util.Map<String, ?> map) throws Exception {
            ListChangeSetsResponseChangeSets self = new ListChangeSetsResponseChangeSets();
            return TeaModel.build(map, self);
        }

    }

}
