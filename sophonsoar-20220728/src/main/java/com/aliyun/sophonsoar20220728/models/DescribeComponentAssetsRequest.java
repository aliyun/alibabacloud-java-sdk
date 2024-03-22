// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetsRequest extends TeaModel {
    /**
     * <p>The name of the component.</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeComponentAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetsRequest self = new DescribeComponentAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetsRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public DescribeComponentAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
