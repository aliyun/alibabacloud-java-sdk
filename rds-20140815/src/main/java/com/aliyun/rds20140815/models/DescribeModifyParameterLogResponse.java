// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeModifyParameterLogResponseItems items;

    public static DescribeModifyParameterLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponse self = new DescribeModifyParameterLogResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeModifyParameterLogResponseItemsParameterChangeLog extends TeaModel {
        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("OldParameterValue")
        @Validation(required = true)
        public String oldParameterValue;

        @NameInMap("NewParameterValue")
        @Validation(required = true)
        public String newParameterValue;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeModifyParameterLogResponseItemsParameterChangeLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseItemsParameterChangeLog self = new DescribeModifyParameterLogResponseItemsParameterChangeLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeModifyParameterLogResponseItems extends TeaModel {
        @NameInMap("ParameterChangeLog")
        @Validation(required = true)
        public java.util.List<DescribeModifyParameterLogResponseItemsParameterChangeLog> parameterChangeLog;

        public static DescribeModifyParameterLogResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseItems self = new DescribeModifyParameterLogResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
