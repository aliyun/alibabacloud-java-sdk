// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75912036-5527-4B7E-9265-B481D6651AC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A JSON string that levels the details of the portal menu list. Valid values:</p>
     * <ul>
     * <li><p>menuType: the type of the menu.</p>
     * <ul>
     * <li>0: dashboard</li>
     * <li>1: outer chain</li>
     * <li>2: workbook</li>
     * <li>4: directory folder</li>
     * <li>5: form filling</li>
     * <li>6: self-service data retrieval</li>
     * </ul>
     * </li>
     * <li><p>menuId: menu ID</p>
     * </li>
     * <li><p>uri: ID or URL of the resource associated with the menu</p>
     * </li>
     * <li><p>showOnlyWithAccess: Authorized Only Visible</p>
     * </li>
     * <li><p>menuName: menu display name</p>
     * </li>
     * <li><p>dependentPermisson: whether the report resource associated with the menu has permissions</p>
     * </li>
     * <li><p>children: submenu</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;children&quot;:[{&quot;children&quot;:[{&quot;children&quot;:[{&quot;menuId&quot;:&quot;54kqgoa****&quot;,&quot;menuName&quot;:&quot;报表菜单&quot;,&quot;menuType&quot;:0,&quot;showOnlyWithAccess&quot;:true,&quot;dependentPermisson&quot;:false,&quot;uri&quot;:&quot;e5da4a3f-d7f9-4262-a39e-a840043c****&quot;},{&quot;menuId&quot;:&quot;pg1n135****&quot;,&quot;menuName&quot;:&quot;目录菜单&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;23a7d5d8-e55a-4737-b6a1-3c585505****&quot;,&quot;menuName&quot;:&quot;pop三级菜单&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:true,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;80764f3c-affd-45a1-aaa1-bb039d8a****&quot;,&quot;menuName&quot;:&quot;pop二级菜单&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;277f968a-22ff-4ce6-83f0-a82950f4****&quot;,&quot;menuName&quot;:&quot;pop一级菜单&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}]</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
