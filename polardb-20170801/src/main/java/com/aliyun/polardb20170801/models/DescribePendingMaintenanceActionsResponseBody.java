// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TypeList")
    public java.util.List<DescribePendingMaintenanceActionsResponseBodyTypeList> typeList;

    public static DescribePendingMaintenanceActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionsResponseBody self = new DescribePendingMaintenanceActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePendingMaintenanceActionsResponseBody setTypeList(java.util.List<DescribePendingMaintenanceActionsResponseBodyTypeList> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<DescribePendingMaintenanceActionsResponseBodyTypeList> getTypeList() {
        return this.typeList;
    }

    public static class DescribePendingMaintenanceActionsResponseBodyTypeList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribePendingMaintenanceActionsResponseBodyTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribePendingMaintenanceActionsResponseBodyTypeList self = new DescribePendingMaintenanceActionsResponseBodyTypeList();
            return TeaModel.build(map, self);
        }

        public DescribePendingMaintenanceActionsResponseBodyTypeList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePendingMaintenanceActionsResponseBodyTypeList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
