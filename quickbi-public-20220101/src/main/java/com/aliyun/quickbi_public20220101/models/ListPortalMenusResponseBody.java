// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A JSON string that levels the details of the portal menu list. Valid values:</p>
     * <br>
     * <p>*   menuType: the type of the menu.</p>
     * <br>
     * <p>    *   0: dashboard</p>
     * <p>    *   1: outer chain</p>
     * <p>    *   2: workbook</p>
     * <p>    *   4: directory folder</p>
     * <p>    *   5: form filling</p>
     * <p>    *   6: self-service data retrieval</p>
     * <br>
     * <p>*   menuId: menu ID</p>
     * <br>
     * <p>*   uri: ID or URL of the resource associated with the menu</p>
     * <br>
     * <p>*   showOnlyWithAccess: Authorized Only Visible</p>
     * <br>
     * <p>*   menuName: menu display name</p>
     * <br>
     * <p>*   dependentPermisson: whether the report resource associated with the menu has permissions</p>
     * <br>
     * <p>*   children: submenu</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPortalMenusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenusResponseBody self = new ListPortalMenusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPortalMenusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPortalMenusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ListPortalMenusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
