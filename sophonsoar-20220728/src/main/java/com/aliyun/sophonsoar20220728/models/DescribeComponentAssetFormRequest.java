// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetFormRequest extends TeaModel {
    /**
     * <p>The component name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>python3</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeComponentAssetFormRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetFormRequest self = new DescribeComponentAssetFormRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetFormRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public DescribeComponentAssetFormRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
