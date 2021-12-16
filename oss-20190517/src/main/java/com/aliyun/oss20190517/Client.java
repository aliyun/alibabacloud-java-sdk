// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517;

import com.aliyun.tea.*;
import com.aliyun.oss20190517.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.gateway.spi.*;
import com.aliyun.gateway.oss.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public com.aliyun.gateway.spi.Client _client;
    public Client(Config config) throws Exception {
        super(config);
        this._client = new com.aliyun.gateway.oss.Client();
        this._spi = _client;
        this._endpointRule = "";
    }


    public AbortBucketWormResponse abortBucketWorm(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortBucketWormWithOptions(bucket, headers, runtime);
    }

    public AbortBucketWormResponse abortBucketWormWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AbortBucketWormResponse());
    }

    public AbortMultipartUploadResponse abortMultipartUpload(String bucket, String key, AbortMultipartUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public AbortMultipartUploadResponse abortMultipartUploadWithOptions(String bucket, String key, AbortMultipartUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AbortMultipartUploadResponse());
    }

    public AppendObjectResponse appendObject(String bucket, String key, AppendObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        AppendObjectHeaders headers = new AppendObjectHeaders();
        return this.appendObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public AppendObjectResponse appendObjectWithOptions(String bucket, String key, AppendObjectRequest request, AppendObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("position", request.position);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.cacheControl)) {
            realHeaders.put("Cache-Control", com.aliyun.teautil.Common.toJSONString(headers.cacheControl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentDisposition)) {
            realHeaders.put("Content-Disposition", com.aliyun.teautil.Common.toJSONString(headers.contentDisposition));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentEncoding)) {
            realHeaders.put("Content-Encoding", com.aliyun.teautil.Common.toJSONString(headers.contentEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentMD5)) {
            realHeaders.put("Content-MD5", com.aliyun.teautil.Common.toJSONString(headers.contentMD5));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.expires)) {
            realHeaders.put("Expires", com.aliyun.teautil.Common.toJSONString(headers.expires));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppendObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?append"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AppendObjectResponse());
    }

    public CompleteBucketWormResponse completeBucketWorm(String bucket, CompleteBucketWormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeBucketWormWithOptions(bucket, request, headers, runtime);
    }

    public CompleteBucketWormResponse completeBucketWormWithOptions(String bucket, CompleteBucketWormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wormId)) {
            query.put("wormId", request.wormId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CompleteBucketWormResponse());
    }

    public CompleteMultipartUploadResponse completeMultipartUpload(String bucket, String key, CompleteMultipartUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CompleteMultipartUploadHeaders headers = new CompleteMultipartUploadHeaders();
        return this.completeMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public CompleteMultipartUploadResponse completeMultipartUploadWithOptions(String bucket, String key, CompleteMultipartUploadRequest request, CompleteMultipartUploadHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.completeMultipartUpload))) {
            body.put("completeMultipartUpload", request.completeMultipartUpload);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.completeAll)) {
            realHeaders.put("x-oss-complete-all", com.aliyun.teautil.Common.toJSONString(headers.completeAll));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CompleteMultipartUploadResponse());
    }

    public CopyObjectResponse copyObject(String bucket, String key) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CopyObjectHeaders headers = new CopyObjectHeaders();
        return this.copyObjectWithOptions(bucket, key, headers, runtime);
    }

    public CopyObjectResponse copyObjectWithOptions(String bucket, String key, CopyObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySource)) {
            realHeaders.put("x-oss-copy-source", com.aliyun.teautil.Common.toJSONString(headers.copySource));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfMatch)) {
            realHeaders.put("x-oss-copy-source-if-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfModifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-modified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfNoneMatch)) {
            realHeaders.put("x-oss-copy-source-if-none-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfUnmodifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-unmodified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metadataDirective)) {
            realHeaders.put("x-oss-metadata-directive", com.aliyun.teautil.Common.toJSONString(headers.metadataDirective));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sse)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.sse));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOssTaggingDirective)) {
            realHeaders.put("x-oss-tagging-directive", com.aliyun.teautil.Common.toJSONString(headers.xOssTaggingDirective));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CopyObjectResponse());
    }

    public DeleteBucketResponse deleteBucket(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketResponse deleteBucketWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucket"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketResponse());
    }

    public DeleteBucketCorsResponse deleteBucketCors(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketCorsWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketCorsResponse deleteBucketCorsWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketCorsResponse());
    }

    public DeleteBucketEncryptionResponse deleteBucketEncryption(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketEncryptionWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketEncryptionResponse deleteBucketEncryptionWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketEncryptionResponse());
    }

    public DeleteBucketInventoryResponse deleteBucketInventory(String bucket, DeleteBucketInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public DeleteBucketInventoryResponse deleteBucketInventoryWithOptions(String bucket, DeleteBucketInventoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketInventoryResponse());
    }

    public DeleteBucketLifecycleResponse deleteBucketLifecycle(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketLifecycleWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketLifecycleResponse deleteBucketLifecycleWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketLifecycleResponse());
    }

    public DeleteBucketLoggingResponse deleteBucketLogging(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketLoggingWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketLoggingResponse deleteBucketLoggingWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketLoggingResponse());
    }

    public DeleteBucketPolicyResponse deleteBucketPolicy(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketPolicyWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketPolicyResponse deleteBucketPolicyWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketPolicyResponse());
    }

    public DeleteBucketReplicationResponse deleteBucketReplication(String bucket, DeleteBucketReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketReplicationWithOptions(bucket, request, headers, runtime);
    }

    public DeleteBucketReplicationResponse deleteBucketReplicationWithOptions(String bucket, DeleteBucketReplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.body))) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication&comp=delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketReplicationResponse());
    }

    public DeleteBucketTagsResponse deleteBucketTags(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketTagsWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketTagsResponse deleteBucketTagsWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketTagsResponse());
    }

    public DeleteBucketWebsiteResponse deleteBucketWebsite(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketWebsiteWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketWebsiteResponse deleteBucketWebsiteWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketWebsiteResponse());
    }

    public DeleteLiveChannelResponse deleteLiveChannel(String bucket, String channel) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLiveChannelWithOptions(bucket, channel, headers, runtime);
    }

    public DeleteLiveChannelResponse deleteLiveChannelWithOptions(String bucket, String channel, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteLiveChannelResponse());
    }

    public DeleteMultipleObjectsResponse deleteMultipleObjects(DeleteMultipleObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMultipleObjectsWithOptions(request, headers, runtime);
    }

    public DeleteMultipleObjectsResponse deleteMultipleObjectsWithOptions(DeleteMultipleObjectsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.delete))) {
            body.put("delete", request.delete);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultipleObjects"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMultipleObjectsResponse());
    }

    public DeleteObjectResponse deleteObject(String bucket, String key, DeleteObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public DeleteObjectResponse deleteObjectWithOptions(String bucket, String key, DeleteObjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteObjectResponse());
    }

    public DeleteObjectTaggingResponse deleteObjectTagging(String bucket, String key, DeleteObjectTaggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public DeleteObjectTaggingResponse deleteObjectTaggingWithOptions(String bucket, String key, DeleteObjectTaggingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteObjectTaggingResponse());
    }

    public ExtendBucketWormResponse extendBucketWorm(String bucket, ExtendBucketWormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.extendBucketWormWithOptions(bucket, request, headers, runtime);
    }

    public ExtendBucketWormResponse extendBucketWormWithOptions(String bucket, ExtendBucketWormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wormId)) {
            query.put("wormId", request.wormId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.extendWormConfiguration))) {
            body.put("extendWormConfiguration", request.extendWormConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtendBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?wormExtend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ExtendBucketWormResponse());
    }

    public GetBucketResponse getBucket(String bucket, GetBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketResponse getBucketWithOptions(String bucket, GetBucketRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucket"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketResponse());
    }

    public GetBucketAclResponse getBucketAcl(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketAclWithOptions(bucket, headers, runtime);
    }

    public GetBucketAclResponse getBucketAclWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketAclResponse());
    }

    public GetBucketCorsResponse getBucketCors(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketCorsWithOptions(bucket, headers, runtime);
    }

    public GetBucketCorsResponse getBucketCorsWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketCorsResponse());
    }

    public GetBucketEncryptionResponse getBucketEncryption(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketEncryptionWithOptions(bucket, headers, runtime);
    }

    public GetBucketEncryptionResponse getBucketEncryptionWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketEncryptionResponse());
    }

    public GetBucketInfoResponse getBucketInfo(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketInfoWithOptions(bucket, headers, runtime);
    }

    public GetBucketInfoResponse getBucketInfoWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketInfo"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?bucketInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketInfoResponse());
    }

    public GetBucketInventoryResponse getBucketInventory(String bucket, GetBucketInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketInventoryResponse getBucketInventoryWithOptions(String bucket, GetBucketInventoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketInventoryResponse());
    }

    public GetBucketLifecycleResponse getBucketLifecycle(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLifecycleWithOptions(bucket, headers, runtime);
    }

    public GetBucketLifecycleResponse getBucketLifecycleWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLifecycleResponse());
    }

    public GetBucketLocationResponse getBucketLocation(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLocationWithOptions(bucket, headers, runtime);
    }

    public GetBucketLocationResponse getBucketLocationWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLocation"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?location"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLocationResponse());
    }

    public GetBucketLoggingResponse getBucketLogging(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLoggingWithOptions(bucket, headers, runtime);
    }

    public GetBucketLoggingResponse getBucketLoggingWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLoggingResponse());
    }

    public GetBucketPolicyResponse getBucketPolicy(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketPolicyWithOptions(bucket, headers, runtime);
    }

    public GetBucketPolicyResponse getBucketPolicyWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketPolicyResponse());
    }

    public GetBucketRefererResponse getBucketReferer(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketRefererWithOptions(bucket, headers, runtime);
    }

    public GetBucketRefererResponse getBucketRefererWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReferer"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?referer"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketRefererResponse());
    }

    public GetBucketReplicationResponse getBucketReplication(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationWithOptions(bucket, headers, runtime);
    }

    public GetBucketReplicationResponse getBucketReplicationWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationResponse());
    }

    public GetBucketReplicationLocationResponse getBucketReplicationLocation(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationLocationWithOptions(bucket, headers, runtime);
    }

    public GetBucketReplicationLocationResponse getBucketReplicationLocationWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplicationLocation"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replicationLocation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationLocationResponse());
    }

    public GetBucketReplicationProgressResponse getBucketReplicationProgress(String bucket, GetBucketReplicationProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationProgressWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketReplicationProgressResponse getBucketReplicationProgressWithOptions(String bucket, GetBucketReplicationProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("rule-id", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplicationProgress"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replicationProgress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationProgressResponse());
    }

    public GetBucketRequestPaymentResponse getBucketRequestPayment(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketRequestPaymentWithOptions(bucket, headers, runtime);
    }

    public GetBucketRequestPaymentResponse getBucketRequestPaymentWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketRequestPayment"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?requestPayment"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketRequestPaymentResponse());
    }

    public GetBucketTagsResponse getBucketTags(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketTagsWithOptions(bucket, headers, runtime);
    }

    public GetBucketTagsResponse getBucketTagsWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketTagsResponse());
    }

    public GetBucketTransferAccelerationResponse getBucketTransferAcceleration(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketTransferAccelerationWithOptions(bucket, headers, runtime);
    }

    public GetBucketTransferAccelerationResponse getBucketTransferAccelerationWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketTransferAcceleration"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?transferAcceleration"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketTransferAccelerationResponse());
    }

    public GetBucketVersioningResponse getBucketVersioning(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketVersioningWithOptions(bucket, headers, runtime);
    }

    public GetBucketVersioningResponse getBucketVersioningWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketVersioning"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versioning"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketVersioningResponse());
    }

    public GetBucketWebsiteResponse getBucketWebsite(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketWebsiteWithOptions(bucket, headers, runtime);
    }

    public GetBucketWebsiteResponse getBucketWebsiteWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketWebsiteResponse());
    }

    public GetBucketWormResponse getBucketWorm(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketWormWithOptions(bucket, headers, runtime);
    }

    public GetBucketWormResponse getBucketWormWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketWormResponse());
    }

    public GetLiveChannelHistoryResponse getLiveChannelHistory(String bucket, String channel) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelHistoryWithOptions(bucket, channel, headers, runtime);
    }

    public GetLiveChannelHistoryResponse getLiveChannelHistoryWithOptions(String bucket, String channel, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelHistory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live&comp=history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelHistoryResponse());
    }

    public GetLiveChannelInfoResponse getLiveChannelInfo(String bucket, String channel) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelInfoWithOptions(bucket, channel, headers, runtime);
    }

    public GetLiveChannelInfoResponse getLiveChannelInfoWithOptions(String bucket, String channel, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelInfo"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelInfoResponse());
    }

    public GetLiveChannelStatResponse getLiveChannelStat(String bucket, String channel) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelStatWithOptions(bucket, channel, headers, runtime);
    }

    public GetLiveChannelStatResponse getLiveChannelStatWithOptions(String bucket, String channel, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelStat"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live&comp=stat"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelStatResponse());
    }

    public GetObjectResponse getObject(String bucket, String key, GetObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetObjectHeaders headers = new GetObjectHeaders();
        return this.getObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectResponse getObjectWithOptions(String bucket, String key, GetObjectRequest request, GetObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.responseCacheControl)) {
            query.put("response-cache-control", request.responseCacheControl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentDisposition)) {
            query.put("response-content-disposition", request.responseContentDisposition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentEncoding)) {
            query.put("response-content-encoding", request.responseContentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentLanguage)) {
            query.put("response-content-language", request.responseContentLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentType)) {
            query.put("response-content-type", request.responseContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseExpires)) {
            query.put("response-expires", request.responseExpires);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("Accept-Encoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifModifiedSince)) {
            realHeaders.put("If-Modified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifNoneMatch)) {
            realHeaders.put("If-None-Match", com.aliyun.teautil.Common.toJSONString(headers.ifNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifUnmodifiedSince)) {
            realHeaders.put("If-Unmodified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.range)) {
            realHeaders.put("Range", com.aliyun.teautil.Common.toJSONString(headers.range));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectResponse());
    }

    public GetObjectAclResponse getObjectAcl(String bucket, String key, GetObjectAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectAclWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectAclResponse getObjectAclWithOptions(String bucket, String key, GetObjectAclRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectAclResponse());
    }

    public GetObjectMetaResponse getObjectMeta(String bucket, String key, GetObjectMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectMetaWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectMetaResponse getObjectMetaWithOptions(String bucket, String key, GetObjectMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectMeta"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?objectMeta"),
            new TeaPair("method", "HEAD"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectMetaResponse());
    }

    public GetObjectTaggingResponse getObjectTagging(String bucket, String key, GetObjectTaggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectTaggingResponse getObjectTaggingWithOptions(String bucket, String key, GetObjectTaggingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectTaggingResponse());
    }

    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetServiceResponse());
    }

    public GetSymlinkResponse getSymlink(String bucket, String key, GetSymlinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSymlinkWithOptions(bucket, key, request, headers, runtime);
    }

    public GetSymlinkResponse getSymlinkWithOptions(String bucket, String key, GetSymlinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSymlink"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?symlink"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSymlinkResponse());
    }

    public GetVodPlaylistResponse getVodPlaylist(String bucket, String channel, GetVodPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVodPlaylistWithOptions(bucket, channel, request, headers, runtime);
    }

    public GetVodPlaylistResponse getVodPlaylistWithOptions(String bucket, String channel, GetVodPlaylistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVodPlaylist"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?vod"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVodPlaylistResponse());
    }

    public HeadObjectResponse headObject(String bucket, String key, HeadObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        HeadObjectHeaders headers = new HeadObjectHeaders();
        return this.headObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public HeadObjectResponse headObjectWithOptions(String bucket, String key, HeadObjectRequest request, HeadObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifModifiedSince)) {
            realHeaders.put("If-Modified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifNoneMatch)) {
            realHeaders.put("If-None-Match", com.aliyun.teautil.Common.toJSONString(headers.ifNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifUnmodifiedSince)) {
            realHeaders.put("If-Unmodified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifUnmodifiedSince));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HeadObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "HEAD"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new HeadObjectResponse());
    }

    public InitiateBucketWormResponse initiateBucketWorm(String bucket, InitiateBucketWormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initiateBucketWormWithOptions(bucket, request, headers, runtime);
    }

    public InitiateBucketWormResponse initiateBucketWormWithOptions(String bucket, InitiateBucketWormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.initiateWormConfiguration))) {
            body.put("InitiateWormConfiguration", request.initiateWormConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitiateBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InitiateBucketWormResponse());
    }

    public InitiateMultipartUploadResponse initiateMultipartUpload(String bucket, String key, InitiateMultipartUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        InitiateMultipartUploadHeaders headers = new InitiateMultipartUploadHeaders();
        return this.initiateMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public InitiateMultipartUploadResponse initiateMultipartUploadWithOptions(String bucket, String key, InitiateMultipartUploadRequest request, InitiateMultipartUploadHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.cacheControl)) {
            realHeaders.put("Cache-Control", com.aliyun.teautil.Common.toJSONString(headers.cacheControl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentDisposition)) {
            realHeaders.put("Content-Disposition", com.aliyun.teautil.Common.toJSONString(headers.contentDisposition));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentEncoding)) {
            realHeaders.put("Content-Encoding", com.aliyun.teautil.Common.toJSONString(headers.contentEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.expires)) {
            realHeaders.put("Expires", com.aliyun.teautil.Common.toJSONString(headers.expires));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseDataEncryption)) {
            realHeaders.put("x-oss-server-side-data-encryption", com.aliyun.teautil.Common.toJSONString(headers.sseDataEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitiateMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?uploads"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InitiateMultipartUploadResponse());
    }

    public ListBucketInventoryResponse listBucketInventory(String bucket, ListBucketInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public ListBucketInventoryResponse listBucketInventoryWithOptions(String bucket, ListBucketInventoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continuationToken)) {
            query.put("continuation-token", request.continuationToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListBucketInventoryResponse());
    }

    public ListBucketsResponse listBuckets(ListBucketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBucketsWithOptions(request, headers, runtime);
    }

    public ListBucketsResponse listBucketsWithOptions(ListBucketsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBuckets"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListBucketsResponse());
    }

    public ListLiveChannelResponse listLiveChannel(String bucket, ListLiveChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLiveChannelWithOptions(bucket, request, headers, runtime);
    }

    public ListLiveChannelResponse listLiveChannelWithOptions(String bucket, ListLiveChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?live"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListLiveChannelResponse());
    }

    public ListMultipartUploadsResponse listMultipartUploads(String bucket, ListMultipartUploadsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMultipartUploadsWithOptions(bucket, request, headers, runtime);
    }

    public ListMultipartUploadsResponse listMultipartUploadsWithOptions(String bucket, ListMultipartUploadsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyMarker)) {
            query.put("key-marker", request.keyMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxUploads)) {
            query.put("max-uploads", request.maxUploads);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadIdMarker)) {
            query.put("upload-id-marker", request.uploadIdMarker);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultipartUploads"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?uploads"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMultipartUploadsResponse());
    }

    public ListObjectVersionsResponse listObjectVersions(String bucket, ListObjectVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectVersionsWithOptions(bucket, request, headers, runtime);
    }

    public ListObjectVersionsResponse listObjectVersionsWithOptions(String bucket, ListObjectVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyMarker)) {
            query.put("key-marker", request.keyMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionIdMarker)) {
            query.put("version-id-marker", request.versionIdMarker);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjectVersions"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectVersionsResponse());
    }

    public ListObjectsResponse listObjects(String bucket, ListObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectsWithOptions(bucket, request, headers, runtime);
    }

    public ListObjectsResponse listObjectsWithOptions(String bucket, ListObjectsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjects"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectsResponse());
    }

    public ListObjectsV2Response listObjectsV2(String bucket, ListObjectsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectsV2WithOptions(bucket, request, headers, runtime);
    }

    public ListObjectsV2Response listObjectsV2WithOptions(String bucket, ListObjectsV2Request request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continuationToken)) {
            query.put("continuation-token", request.continuationToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchOwner)) {
            query.put("fetch-owner", request.fetchOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAfter)) {
            query.put("start-after", request.startAfter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjectsV2"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?list-type=2"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectsV2Response());
    }

    public ListPartsResponse listParts(String bucket, String key, ListPartsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartsWithOptions(bucket, key, request, headers, runtime);
    }

    public ListPartsResponse listPartsWithOptions(String bucket, String key, ListPartsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        ListPartsShrinkRequest request = new ListPartsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encodingType)) {
            request.encodingTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encodingType, "encoding-type", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingTypeShrink)) {
            query.put("encoding-type", request.encodingTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxParts)) {
            query.put("max-parts", request.maxParts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partNumberMarker)) {
            query.put("part-number-marker", request.partNumberMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParts"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListPartsResponse());
    }

    public OptionObjectResponse optionObject(String bucket, String key) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        OptionObjectHeaders headers = new OptionObjectHeaders();
        return this.optionObjectWithOptions(bucket, key, headers, runtime);
    }

    public OptionObjectResponse optionObjectWithOptions(String bucket, String key, OptionObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accessControlRequestHeaders)) {
            realHeaders.put("Access-Control-Request-Headers", com.aliyun.teautil.Common.toJSONString(headers.accessControlRequestHeaders));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accessControlRequestMethod)) {
            realHeaders.put("Access-Control-Request-Method", com.aliyun.teautil.Common.toJSONString(headers.accessControlRequestMethod));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.origin)) {
            realHeaders.put("Origin", com.aliyun.teautil.Common.toJSONString(headers.origin));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OptionObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "OPTIONS"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OptionObjectResponse());
    }

    public PostObjectResponse postObject(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postObjectWithOptions(bucket, headers, runtime);
    }

    public PostObjectResponse postObjectWithOptions(String bucket, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PostObjectResponse());
    }

    public PostVodPlaylistResponse postVodPlaylist(String bucket, String channel, String playlist, PostVodPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postVodPlaylistWithOptions(bucket, channel, playlist, request, headers, runtime);
    }

    public PostVodPlaylistResponse postVodPlaylistWithOptions(String bucket, String channel, String playlist, PostVodPlaylistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        playlist = com.aliyun.openapiutil.Client.getEncodeParam(playlist);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostVodPlaylist"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "/" + playlist + "?vod"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PostVodPlaylistResponse());
    }

    public PutBucketResponse putBucket(String bucket, PutBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutBucketHeaders headers = new PutBucketHeaders();
        return this.putBucketWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketResponse putBucketWithOptions(String bucket, PutBucketRequest request, PutBucketHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.createBucketConfiguration))) {
            body.put("CreateBucketConfiguration", request.createBucketConfiguration);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucket"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketResponse());
    }

    public PutBucketAclResponse putBucketAcl(String bucket) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutBucketAclHeaders headers = new PutBucketAclHeaders();
        return this.putBucketAclWithOptions(bucket, headers, runtime);
    }

    public PutBucketAclResponse putBucketAclWithOptions(String bucket, PutBucketAclHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketAclResponse());
    }

    public PutBucketCorsResponse putBucketCors(String bucket, PutBucketCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketCorsWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketCorsResponse putBucketCorsWithOptions(String bucket, PutBucketCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.cORSConfiguration))) {
            body.put("CORSConfiguration", request.cORSConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketCorsResponse());
    }

    public PutBucketEncryptionResponse putBucketEncryption(String bucket, PutBucketEncryptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketEncryptionWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketEncryptionResponse putBucketEncryptionWithOptions(String bucket, PutBucketEncryptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.serverSideEncryptionRule))) {
            body.put("ServerSideEncryptionRule", request.serverSideEncryptionRule);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketEncryptionResponse());
    }

    public PutBucketInventoryResponse putBucketInventory(String bucket, PutBucketInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketInventoryResponse putBucketInventoryWithOptions(String bucket, PutBucketInventoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.inventoryConfiguration))) {
            body.put("InventoryConfiguration", request.inventoryConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketInventoryResponse());
    }

    public PutBucketLifecycleResponse putBucketLifecycle(String bucket, PutBucketLifecycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketLifecycleWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketLifecycleResponse putBucketLifecycleWithOptions(String bucket, PutBucketLifecycleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.lifecycleConfiguration))) {
            body.put("LifecycleConfiguration", request.lifecycleConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketLifecycleResponse());
    }

    public PutBucketLoggingResponse putBucketLogging(String bucket, PutBucketLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketLoggingWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketLoggingResponse putBucketLoggingWithOptions(String bucket, PutBucketLoggingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.bucketLoggingStatus))) {
            body.put("BucketLoggingStatus", request.bucketLoggingStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketLoggingResponse());
    }

    public PutBucketPolicyResponse putBucketPolicy(String bucket, PutBucketPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketPolicyWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketPolicyResponse putBucketPolicyWithOptions(String bucket, PutBucketPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", request.policy)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketPolicyResponse());
    }

    public PutBucketRefererResponse putBucketReferer(String bucket, PutBucketRefererRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketRefererWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketRefererResponse putBucketRefererWithOptions(String bucket, PutBucketRefererRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.refererConfiguration))) {
            body.put("RefererConfiguration", request.refererConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketReferer"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?referer"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketRefererResponse());
    }

    public PutBucketReplicationResponse putBucketReplication(String bucket, PutBucketReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketReplicationWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketReplicationResponse putBucketReplicationWithOptions(String bucket, PutBucketReplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.replicationConfiguration))) {
            body.put("ReplicationConfiguration", request.replicationConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication&comp=add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketReplicationResponse());
    }

    public PutBucketRequestPaymentResponse putBucketRequestPayment(String bucket, PutBucketRequestPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketRequestPaymentWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketRequestPaymentResponse putBucketRequestPaymentWithOptions(String bucket, PutBucketRequestPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.requestPaymentConfiguration))) {
            body.put("RequestPaymentConfiguration", request.requestPaymentConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketRequestPayment"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?requestPayment"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketRequestPaymentResponse());
    }

    public PutBucketTagsResponse putBucketTags(String bucket, PutBucketTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketTagsWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketTagsResponse putBucketTagsWithOptions(String bucket, PutBucketTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tagging))) {
            body.put("Tagging", request.tagging);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketTagsResponse());
    }

    public PutBucketTransferAccelerationResponse putBucketTransferAcceleration(String bucket, PutBucketTransferAccelerationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketTransferAccelerationWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketTransferAccelerationResponse putBucketTransferAccelerationWithOptions(String bucket, PutBucketTransferAccelerationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.transferAccelerationConfiguration))) {
            body.put("TransferAccelerationConfiguration", request.transferAccelerationConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketTransferAcceleration"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?transferAcceleration"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketTransferAccelerationResponse());
    }

    public PutBucketVersioningResponse putBucketVersioning(String bucket, PutBucketVersioningRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketVersioningWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketVersioningResponse putBucketVersioningWithOptions(String bucket, PutBucketVersioningRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.versioningConfiguration))) {
            body.put("VersioningConfiguration", request.versioningConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketVersioning"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versioning"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketVersioningResponse());
    }

    public PutBucketWebsiteResponse putBucketWebsite(String bucket, PutBucketWebsiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketWebsiteWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketWebsiteResponse putBucketWebsiteWithOptions(String bucket, PutBucketWebsiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.websiteConfiguration))) {
            body.put("WebsiteConfiguration", request.websiteConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketWebsiteResponse());
    }

    public PutLiveChannelResponse putLiveChannel(String bucket, String channel, PutLiveChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLiveChannelWithOptions(bucket, channel, request, headers, runtime);
    }

    public PutLiveChannelResponse putLiveChannelWithOptions(String bucket, String channel, PutLiveChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.liveChannelConfiguration))) {
            body.put("LiveChannelConfiguration", request.liveChannelConfiguration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLiveChannelResponse());
    }

    public PutLiveChannelStatusResponse putLiveChannelStatus(String bucket, String channel, PutLiveChannelStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLiveChannelStatusWithOptions(bucket, channel, request, headers, runtime);
    }

    public PutLiveChannelStatusResponse putLiveChannelStatusWithOptions(String bucket, String channel, PutLiveChannelStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        channel = com.aliyun.openapiutil.Client.getEncodeParam(channel);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLiveChannelStatus"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLiveChannelStatusResponse());
    }

    public PutObjectResponse putObject(String bucket, String key, PutObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutObjectHeaders headers = new PutObjectHeaders();
        return this.putObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public PutObjectResponse putObjectWithOptions(String bucket, String key, PutObjectRequest request, PutObjectHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseDataEncryption)) {
            realHeaders.put("x-oss-server-side-data-encryption", com.aliyun.teautil.Common.toJSONString(headers.sseDataEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectResponse());
    }

    public PutObjectAclResponse putObjectAcl(String bucket, String key, PutObjectAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutObjectAclHeaders headers = new PutObjectAclHeaders();
        return this.putObjectAclWithOptions(bucket, key, request, headers, runtime);
    }

    public PutObjectAclResponse putObjectAclWithOptions(String bucket, String key, PutObjectAclRequest request, PutObjectAclHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObjectAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectAclResponse());
    }

    public PutObjectTaggingResponse putObjectTagging(String bucket, String key, PutObjectTaggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public PutObjectTaggingResponse putObjectTaggingWithOptions(String bucket, String key, PutObjectTaggingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tagging))) {
            body.put("Tagging", request.tagging);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectTaggingResponse());
    }

    public PutSymlinkResponse putSymlink(String bucket, String key) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutSymlinkHeaders headers = new PutSymlinkHeaders();
        return this.putSymlinkWithOptions(bucket, key, headers, runtime);
    }

    public PutSymlinkResponse putSymlinkWithOptions(String bucket, String key, PutSymlinkHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.symlinkTargetKey)) {
            realHeaders.put("x-oss-symlink-target", com.aliyun.teautil.Common.toJSONString(headers.symlinkTargetKey));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutSymlink"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?symlink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutSymlinkResponse());
    }

    public RestoreObjectResponse restoreObject(String bucket, String key, RestoreObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public RestoreObjectResponse restoreObjectWithOptions(String bucket, String key, RestoreObjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.body))) {
            body.put("body", request.body);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?restore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RestoreObjectResponse());
    }

    public SelectObjectResponse selectObject(String bucket, String key, SelectObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public SelectObjectResponse selectObjectWithOptions(String bucket, String key, SelectObjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.selectRequest))) {
            body.put("SelectRequest", request.selectRequest);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SelectObjectResponse());
    }

    public UploadPartResponse uploadPart(String bucket, String key, UploadPartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadPartWithOptions(bucket, key, request, headers, runtime);
    }

    public UploadPartResponse uploadPartWithOptions(String bucket, String key, UploadPartRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partNumber)) {
            query.put("partNumber", request.partNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPart"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UploadPartResponse());
    }

    public UploadPartCopyResponse uploadPartCopy(String bucket, String key, UploadPartCopyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UploadPartCopyHeaders headers = new UploadPartCopyHeaders();
        return this.uploadPartCopyWithOptions(bucket, key, request, headers, runtime);
    }

    public UploadPartCopyResponse uploadPartCopyWithOptions(String bucket, String key, UploadPartCopyRequest request, UploadPartCopyHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        key = com.aliyun.openapiutil.Client.getEncodeParam(key);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partNumber)) {
            query.put("partNumber", request.partNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySource)) {
            realHeaders.put("x-oss-copy-source", com.aliyun.teautil.Common.toJSONString(headers.copySource));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfMatch)) {
            realHeaders.put("x-oss-copy-source-if-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfModifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-modified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfNoneMatch)) {
            realHeaders.put("x-oss-copy-source-if-none-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfUnmodifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-unmodified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceRange)) {
            realHeaders.put("x-oss-copy-source-range", com.aliyun.teautil.Common.toJSONString(headers.copySourceRange));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPartCopy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UploadPartCopyResponse());
    }
}
