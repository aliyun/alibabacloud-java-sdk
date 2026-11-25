// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseUsageResponseBody extends TeaModel {
    /**
     * <p>The query dimension. Valid values:</p>
     * <ul>
     * <li><code>Workspace</code>: A single workspace.</li>
     * <li><code>Account</code>: All workspaces under the caller account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Workspace</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the query range passed in the request, exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The usage list. It returns all seven metering items in a fixed order. If an item has no data within the query range, its usage is 0.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetContextDatabaseUsageResponseBodyItems> items;

    /**
     * <p>The ID of the API request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query range passed in the request, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the queried workspace. This field has a value only when <code>Dimension</code> is set to <code>Workspace</code>. It is empty for the account dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseUsageResponseBody self = new GetContextDatabaseUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseUsageResponseBody setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public GetContextDatabaseUsageResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseUsageResponseBody setItems(java.util.List<GetContextDatabaseUsageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetContextDatabaseUsageResponseBodyItems> getItems() {
        return this.items;
    }

    public GetContextDatabaseUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseUsageResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseUsageResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetContextDatabaseUsageResponseBodyItems extends TeaModel {
        /**
         * <p>The metering item.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBaseRead</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The usage of the item within the query range. The unit is specified by <code>Unit</code>. The number of calls, tokens, and context evolutions are accumulated over the range. Storage is calculated by averaging the occupancy snapshots of each workspace within the range and rounding to the nearest integer byte. For the account dimension, the average values of all workspaces are summed.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The metering unit. Valid values:</p>
         * <ul>
         * <li><code>Count</code>: The number of calls.</li>
         * <li><code>Token</code>: The number of tokens.</li>
         * <li><code>MicroCredit</code>: One millionth of a credit.</li>
         * <li><code>Byte</code>: Bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static GetContextDatabaseUsageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseUsageResponseBodyItems self = new GetContextDatabaseUsageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseUsageResponseBodyItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public GetContextDatabaseUsageResponseBodyItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public GetContextDatabaseUsageResponseBodyItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
