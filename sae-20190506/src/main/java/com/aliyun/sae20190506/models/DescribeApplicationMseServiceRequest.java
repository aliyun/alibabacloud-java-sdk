// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationMseServiceRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether the throttling and degradation feature is enabled. Set this parameter to true when you call API operations related to throttling and degradation. Otherwise, set this parameter to false. Valid values:</p>
     * <ul>
     * <li>true: Checks the permissions for throttling and degradation.</li>
     * <li>false: Does not check the permissions for throttling and degradation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    public static DescribeApplicationMseServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationMseServiceRequest self = new DescribeApplicationMseServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationMseServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationMseServiceRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

}
