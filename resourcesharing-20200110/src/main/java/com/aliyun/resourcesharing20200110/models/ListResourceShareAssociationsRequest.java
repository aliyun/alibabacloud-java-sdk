// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsRequest extends TeaModel {
    /**
     * <p>The association status. Valid values:</p>
     * <ul>
     * <li>Associating: The entity is being associated.</li>
     * <li>Associated: The entity is associated.</li>
     * <li>Failed: The entity fails to be associated.</li>
     * <li>Disassociating: The entity is being disassociated.</li>
     * <li>Disassociated: The entity is disassociated.</li>
     * </ul>
     * <blockquote>
     * <p> The system deletes the records of entities in the <code>Failed</code> or <code>Disassociated</code> state within 48 hours to 96 hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Associated</p>
     */
    @NameInMap("AssociationStatus")
    public String associationStatus;

    /**
     * <p>The association type. Valid values:</p>
     * <ul>
     * <li>Resource</li>
     * <li>Target</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("AssociationType")
    public String associationType;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource.</p>
     * <blockquote>
     * <p> This parameter is unavailable if you set the <code>AssociationType</code> parameter to <code>Target</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp183p93qs667muql****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The IDs of the resource shares.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-6GRmdD3X****</p>
     */
    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    /**
     * <p>The ID of the principal.</p>
     * <blockquote>
     * <p> This parameter is unavailable if you set the <code>AssociationType</code> parameter to <code>Resource</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172050525300****</p>
     */
    @NameInMap("Target")
    public String target;

    public static ListResourceShareAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsRequest self = new ListResourceShareAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsRequest setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
        return this;
    }
    public String getAssociationStatus() {
        return this.associationStatus;
    }

    public ListResourceShareAssociationsRequest setAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }
    public String getAssociationType() {
        return this.associationType;
    }

    public ListResourceShareAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceShareAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareAssociationsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourceShareAssociationsRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListResourceShareAssociationsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
