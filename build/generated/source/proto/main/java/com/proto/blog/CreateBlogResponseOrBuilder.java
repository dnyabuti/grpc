// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

public interface CreateBlogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blog.CreateBlogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id corresponds to the one created in mongodb
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  boolean hasBlog();
  /**
   * <pre>
   * id corresponds to the one created in mongodb
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  com.proto.blog.Blog getBlog();
  /**
   * <pre>
   * id corresponds to the one created in mongodb
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  com.proto.blog.BlogOrBuilder getBlogOrBuilder();
}
