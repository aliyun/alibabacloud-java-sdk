// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadVodObjectCachesRequest extends TeaModel {
    /**
     * <p>The prefetch region. Valid values: <strong>domestic</strong>, <strong>overseas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>Specifies whether to directly prefetch content to L2 nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The prefetch node level must include L2 nodes.</p>
     * </li>
     * <li><p><strong>false</strong>: Only back-to-origin layer nodes are prefetched. This is the <strong>default value</strong>. The back-to-origin layer node may be an L2 node or an L3 node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    /**
     * <p>The URL of the file to prefetch. Separate multiple URLs with line breaks (
     *  or 
     * ).</p>
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
     * <p>The default header carried in a prefetch request is Accept-Encoding:gzip. If you want the prefetch request to carry other headers or implement multi-copy prefetch, use this parameter to customize prefetch headers. Submit the value in JSON format.</p>
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
