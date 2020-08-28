// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("RouterTableList")
    @Validation(required = true)
    public DescribeRouteTableListResponseRouterTableList routerTableList;

    public static DescribeRouteTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponse self = new DescribeRouteTableListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag> tag;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListType extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RouterType")
        @Validation(required = true)
        public String routerType;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableName")
        @Validation(required = true)
        public String routeTableName;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags tags;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds vSwitchIds;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListType self = new DescribeRouteTableListResponseRouterTableListRouterTableListType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRouteTableListResponseRouterTableList extends TeaModel {
        @NameInMap("RouterTableListType")
        @Validation(required = true)
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListType> routerTableListType;

        public static DescribeRouteTableListResponseRouterTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableList self = new DescribeRouteTableListResponseRouterTableList();
            return TeaModel.build(map, self);
        }

    }

}
