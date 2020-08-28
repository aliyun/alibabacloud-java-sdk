// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksRequest extends TeaModel {
    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentStackId")
    public String parentStackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackName")
    public java.util.List<String> stackName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ShowNestedStack")
    public Boolean showNestedStack;

    @NameInMap("Tag")
    public java.util.List<ListStacksRequestTag> tag;

    @NameInMap("StackId")
    public String stackId;

    public static ListStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStacksRequest self = new ListStacksRequest();
        return TeaModel.build(map, self);
    }

    public static class ListStacksRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListStacksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListStacksRequestTag self = new ListStacksRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
