// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearOperatingObjectFavoritesResponseBody extends TeaModel {
    /**
     * <p>The status code. SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The graph name. You can call listGraphs to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>customer_assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The number of remaining followed objects within the specified scope.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("remainingCount")
    public Long remainingCount;

    /**
     * <p>The number of physical follow records that were actually deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("removedCount")
    public Long removedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the remaining record count has been verified as zero within the same transaction.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("verified")
    public Boolean verified;

    public static ClearOperatingObjectFavoritesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearOperatingObjectFavoritesResponseBody self = new ClearOperatingObjectFavoritesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearOperatingObjectFavoritesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearOperatingObjectFavoritesResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public ClearOperatingObjectFavoritesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClearOperatingObjectFavoritesResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ClearOperatingObjectFavoritesResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ClearOperatingObjectFavoritesResponseBody setRemainingCount(Long remainingCount) {
        this.remainingCount = remainingCount;
        return this;
    }
    public Long getRemainingCount() {
        return this.remainingCount;
    }

    public ClearOperatingObjectFavoritesResponseBody setRemovedCount(Long removedCount) {
        this.removedCount = removedCount;
        return this;
    }
    public Long getRemovedCount() {
        return this.removedCount;
    }

    public ClearOperatingObjectFavoritesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearOperatingObjectFavoritesResponseBody setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }
    public Boolean getVerified() {
        return this.verified;
    }

}
