// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoDRMLicenseResponseBody extends TeaModel {
    /**
     * <p>The returned DRM license.</p>
     * 
     * <strong>example:</strong>
     * <p>cb9swCy8P50H9KePsxET3jZ1tm41bDs9HTsxbWnsjf3bsf6QGdiS4kZPhDaskimbNyAfNjmhQRmWFt3AhwNF3</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The information about the device from which the DRM request was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("device_info")
    public String deviceInfo;

    /**
     * <p>The request state returned by the DRM server.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("states")
    public String states;

    public static VideoDRMLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoDRMLicenseResponseBody self = new VideoDRMLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoDRMLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VideoDRMLicenseResponseBody setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public VideoDRMLicenseResponseBody setStates(String states) {
        this.states = states;
        return this;
    }
    public String getStates() {
        return this.states;
    }

}
