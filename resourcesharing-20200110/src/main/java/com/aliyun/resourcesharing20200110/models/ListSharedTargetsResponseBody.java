// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04677DCA-7C33-464B-8811-1B1DA3C3D197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the principals.</p>
     */
    @NameInMap("SharedTargets")
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets;

    public static ListSharedTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsResponseBody self = new ListSharedTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedTargetsResponseBody setSharedTargets(java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets) {
        this.sharedTargets = sharedTargets;
        return this;
    }
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> getSharedTargets() {
        return this.sharedTargets;
    }

    public static class ListSharedTargetsResponseBodySharedTargets extends TeaModel {
        /**
         * <p>The time when the principal was associated with the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T09:16:59.905Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("External")
        public Boolean external;

        /**
         * <p>The ID of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The ID of the principal or resource owner.</p>
         * <ul>
         * <li>If the value of <code>ResourceOwner</code> is <code>Self</code>, the value of this parameter is the ID of a principal.</li>
         * <li>If the value of <code>ResourceOwner</code> is <code>OtherAccounts</code>, the value of this parameter is the ID of a resource owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The properties of the principal, such as the time range within which the resource is shared.</p>
         * <blockquote>
         * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;timeRange&quot;:{
         *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
         *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
         *         &quot;timezone&quot;:&quot;UTC+8&quot;,
         *         &quot;endAtTime&quot;:&quot;19:59&quot;
         *     }
         * }</p>
         */
        @NameInMap("TargetProperty")
        public String targetProperty;

        /**
         * <p>The time when the association of the principal was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T09:16:59.905Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSharedTargetsResponseBodySharedTargets build(java.util.Map<String, ?> map) throws Exception {
            ListSharedTargetsResponseBodySharedTargets self = new ListSharedTargetsResponseBodySharedTargets();
            return TeaModel.build(map, self);
        }

        public ListSharedTargetsResponseBodySharedTargets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedTargetsResponseBodySharedTargets setExternal(Boolean external) {
            this.external = external;
            return this;
        }
        public Boolean getExternal() {
            return this.external;
        }

        public ListSharedTargetsResponseBodySharedTargets setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedTargetsResponseBodySharedTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListSharedTargetsResponseBodySharedTargets setTargetProperty(String targetProperty) {
            this.targetProperty = targetProperty;
            return this;
        }
        public String getTargetProperty() {
            return this.targetProperty;
        }

        public ListSharedTargetsResponseBodySharedTargets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
