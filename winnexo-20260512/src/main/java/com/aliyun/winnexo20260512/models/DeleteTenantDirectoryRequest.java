// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteTenantDirectoryRequest extends TeaModel {
    /**
     * <p>The deletion mode: reject / recursive / move_to_root.</p>
     * 
     * <strong>example:</strong>
     * <p>reject</p>
     */
    @NameInMap("deleteMode")
    public String deleteMode;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The tenant ID that takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static DeleteTenantDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantDirectoryRequest self = new DeleteTenantDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantDirectoryRequest setDeleteMode(String deleteMode) {
        this.deleteMode = deleteMode;
        return this;
    }
    public String getDeleteMode() {
        return this.deleteMode;
    }

    public DeleteTenantDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteTenantDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
