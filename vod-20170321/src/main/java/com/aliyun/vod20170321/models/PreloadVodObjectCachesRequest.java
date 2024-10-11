// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadVodObjectCachesRequest extends TeaModel {
    /**
     * <p>The acceleration region in which you want to prefetch content. If you do not specify a region, the value overseas is used.</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>Specifies whether to prefetch content to POPs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prefetches content to nodes that include L2 DCDN nodes.</li>
     * <li><strong>false</strong>: prefetches content to L2 POPs or L3 POPs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    /**
     * <p>The URL of the file to be prefetched. Separate multiple URLs with line breaks (\n or \r\n).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vod.test.com/test.txt</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The custom header for prefetch in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Accept-Encoding&quot;: [
     *             &quot;gzip, deflate, br&quot;
     *       ]
     * }</p>
     */
    @NameInMap("WithHeader")
    public String withHeader;

    public static PreloadVodObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadVodObjectCachesRequest self = new PreloadVodObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public PreloadVodObjectCachesRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public PreloadVodObjectCachesRequest setL2Preload(Boolean l2Preload) {
        this.l2Preload = l2Preload;
        return this;
    }
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    public PreloadVodObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public PreloadVodObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PreloadVodObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public PreloadVodObjectCachesRequest setWithHeader(String withHeader) {
        this.withHeader = withHeader;
        return this;
    }
    public String getWithHeader() {
        return this.withHeader;
    }

}
