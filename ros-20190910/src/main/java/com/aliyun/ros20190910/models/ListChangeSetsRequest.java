// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("ChangeSetName")
    public java.util.List<String> changeSetName;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ExecutionStatus")
    public java.util.List<String> executionStatus;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    public static ListChangeSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsRequest self = new ListChangeSetsRequest();
        return TeaModel.build(map, self);
    }

}
