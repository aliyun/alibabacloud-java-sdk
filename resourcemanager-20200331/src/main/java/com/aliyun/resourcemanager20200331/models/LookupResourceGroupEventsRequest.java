// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class LookupResourceGroupEventsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-30 23:43:16</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MemberShipChange</p>
     */
    @NameInMap("EventCategory")
    public String eventCategory;

    /**
     * <p>The attributes used for advanced search.</p>
     */
    @NameInMap("LookupAttributes")
    public java.util.List<LookupResourceGroupEventsRequestLookupAttributes> lookupAttributes;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group name.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectA</p>
     */
    @NameInMap("ResourceGroupDisplayName")
    public String resourceGroupDisplayName;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-30 23:43:16</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static LookupResourceGroupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupResourceGroupEventsRequest self = new LookupResourceGroupEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupResourceGroupEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LookupResourceGroupEventsRequest setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }
    public String getEventCategory() {
        return this.eventCategory;
    }

    public LookupResourceGroupEventsRequest setLookupAttributes(java.util.List<LookupResourceGroupEventsRequestLookupAttributes> lookupAttributes) {
        this.lookupAttributes = lookupAttributes;
        return this;
    }
    public java.util.List<LookupResourceGroupEventsRequestLookupAttributes> getLookupAttributes() {
        return this.lookupAttributes;
    }

    public LookupResourceGroupEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupResourceGroupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupResourceGroupEventsRequest setResourceGroupDisplayName(String resourceGroupDisplayName) {
        this.resourceGroupDisplayName = resourceGroupDisplayName;
        return this;
    }
    public String getResourceGroupDisplayName() {
        return this.resourceGroupDisplayName;
    }

    public LookupResourceGroupEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public LookupResourceGroupEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class LookupResourceGroupEventsRequestLookupAttributes extends TeaModel {
        /**
         * <p>The key of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static LookupResourceGroupEventsRequestLookupAttributes build(java.util.Map<String, ?> map) throws Exception {
            LookupResourceGroupEventsRequestLookupAttributes self = new LookupResourceGroupEventsRequestLookupAttributes();
            return TeaModel.build(map, self);
        }

        public LookupResourceGroupEventsRequestLookupAttributes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LookupResourceGroupEventsRequestLookupAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
