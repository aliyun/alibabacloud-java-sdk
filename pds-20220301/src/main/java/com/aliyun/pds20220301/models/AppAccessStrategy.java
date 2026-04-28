// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AppAccessStrategy extends TeaModel {
    /**
     * <p>The global access policy of the application. Valid values:</p>
     * <ul>
     * <li>allow: The domain allows access from all applications.</li>
     * <li>deny: The domain denies access from all apps. This is the default value.</li>
     * </ul>
     * <p>Recommended settings:</p>
     * <ol>
     * <li>Set effect to deny.</li>
     * <li>Specify except_app_id_list to allow specific applications to access the domain. Example: [&quot;appid1&quot;, &quot;appid2&quot;].</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("effect")
    public String effect;

    /**
     * <p>The IDs of applications excluded from the global access policy.</p>
     * <ul>
     * <li>If you set effect to allow, which indicates that the domain allows access from all applications, the applications specified by this parameter value cannot access the domain.</li>
     * <li>If you set effect to deny, which indicates that the domain denies access from all applications, the applications specified by this parameter value can access the domain.</li>
     * </ul>
     */
    @NameInMap("except_app_id_list")
    public java.util.List<String> exceptAppIdList;

    public static AppAccessStrategy build(java.util.Map<String, ?> map) throws Exception {
        AppAccessStrategy self = new AppAccessStrategy();
        return TeaModel.build(map, self);
    }

    public AppAccessStrategy setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AppAccessStrategy setExceptAppIdList(java.util.List<String> exceptAppIdList) {
        this.exceptAppIdList = exceptAppIdList;
        return this;
    }
    public java.util.List<String> getExceptAppIdList() {
        return this.exceptAppIdList;
    }

}
