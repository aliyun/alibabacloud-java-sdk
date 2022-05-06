// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePGHbaConfigResponseBody extends TeaModel {
    @NameInMap("DefaultHbaItems")
    public DescribePGHbaConfigResponseBodyDefaultHbaItems defaultHbaItems;

    @NameInMap("HbaModifyTime")
    public String hbaModifyTime;

    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningHbaItems")
    public DescribePGHbaConfigResponseBodyRunningHbaItems runningHbaItems;

    public static DescribePGHbaConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePGHbaConfigResponseBody self = new DescribePGHbaConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePGHbaConfigResponseBody setDefaultHbaItems(DescribePGHbaConfigResponseBodyDefaultHbaItems defaultHbaItems) {
        this.defaultHbaItems = defaultHbaItems;
        return this;
    }
    public DescribePGHbaConfigResponseBodyDefaultHbaItems getDefaultHbaItems() {
        return this.defaultHbaItems;
    }

    public DescribePGHbaConfigResponseBody setHbaModifyTime(String hbaModifyTime) {
        this.hbaModifyTime = hbaModifyTime;
        return this;
    }
    public String getHbaModifyTime() {
        return this.hbaModifyTime;
    }

    public DescribePGHbaConfigResponseBody setLastModifyStatus(String lastModifyStatus) {
        this.lastModifyStatus = lastModifyStatus;
        return this;
    }
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    public DescribePGHbaConfigResponseBody setModifyStatusReason(String modifyStatusReason) {
        this.modifyStatusReason = modifyStatusReason;
        return this;
    }
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    public DescribePGHbaConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePGHbaConfigResponseBody setRunningHbaItems(DescribePGHbaConfigResponseBodyRunningHbaItems runningHbaItems) {
        this.runningHbaItems = runningHbaItems;
        return this;
    }
    public DescribePGHbaConfigResponseBodyRunningHbaItems getRunningHbaItems() {
        return this.runningHbaItems;
    }

    public static class DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Database")
        public String database;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Method")
        public String method;

        @NameInMap("Option")
        public String option;

        @NameInMap("PriorityId")
        public Integer priorityId;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem self = new DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribePGHbaConfigResponseBodyDefaultHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> hbaItem;

        public static DescribePGHbaConfigResponseBodyDefaultHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyDefaultHbaItems self = new DescribePGHbaConfigResponseBodyDefaultHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyDefaultHbaItems setHbaItem(java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribePGHbaConfigResponseBodyDefaultHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

    public static class DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Database")
        public String database;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Method")
        public String method;

        @NameInMap("Option")
        public String option;

        @NameInMap("PriorityId")
        public Integer priorityId;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem self = new DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribePGHbaConfigResponseBodyRunningHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        public java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> hbaItem;

        public static DescribePGHbaConfigResponseBodyRunningHbaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePGHbaConfigResponseBodyRunningHbaItems self = new DescribePGHbaConfigResponseBodyRunningHbaItems();
            return TeaModel.build(map, self);
        }

        public DescribePGHbaConfigResponseBodyRunningHbaItems setHbaItem(java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> hbaItem) {
            this.hbaItem = hbaItem;
            return this;
        }
        public java.util.List<DescribePGHbaConfigResponseBodyRunningHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

    }

}
